package study.mvc;


import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MyWebController {

	public MyWebController()
	{
		System.out.println("the controller is created");
	}
	
	
//	@RequestMapping(value="/hello",method=RequestMethod.GET)
//	public String f1()
//	{
//		System.out.println("mapping function f1 is called");
//		return "hello";
//	} OR
	
	@GetMapping(value="/hello") //Shortcut 
	public String f1()
	{
		System.out.println("mapping function f1 is called");
		return "hello";
	}
	
	@GetMapping(value="/welcome")
	public String f2(@RequestParam("uname") String name)
	{
		System.out.println("server got "+name);
		return "hi";
	}
	
	@GetMapping(value="/input")
	public String f3()
	{
		return "input";
	} 
	
	@PostMapping(value="/ShowTable")
	public String f4(Model model , @RequestParam int num)
	{
		
	ArrayList<String> al = 	TableGen.getTable(num);
	model.addAttribute("list",al);
	
	return "table";
	}
	
	@GetMapping(value="/showchars")
	public ModelAndView f5(ModelAndView mv,@RequestParam String line)
	{
		ArrayList<String> al = new ArrayList<String>();
		for(int i=0;i<line.length();i++)
		{
			al.add(""+line.charAt(i));
		}
		
		mv.addObject("list",al);
		mv.setViewName("table");
		return mv;
	}
	
	
	/////////////////////////////////////////HOMEWORK1////////////////////////////////////////////////
	
	@Autowired
	JdbcTemplate template;
	
	@GetMapping(value="/inputhw1")
	public String f7()
	{
		return "inputhw1";
	}
	
	@PostMapping(value="/savehw1")
	public String insert(Model model ,@RequestParam String name, @RequestParam String surname, @RequestParam Date dob)
	{
		template.update("insert into birthday_tracker values(default,?,?,?)",name,surname,dob);
		
		List<BdayTrackerDO> list = template.query("select id from birthday_tracker where name='"+name+"' and surname='"+surname+"' and DOB='"+dob+"'", (rs,rownum)->{return new BdayTrackerDO(rs.getInt(1));});
		
		model.addAttribute("id",list);
        System.out.println("Record inserted Successfully....");
		return "inputhw1";
	}
	
	/////////////////////////////////////////HOMEWORK2////////////////////////////////////
	
	@GetMapping(value="/loginhw2")
	public String f8()
	{
		return "loginhw2";
	}
	
	@PostMapping(value="/verify")
	public String verify(Model model, @RequestParam String uname, @RequestParam String pwd)
	{
		if(uname.equals("iet") && pwd.equals("123"))
		{
			return "home";
		}
		else
		{
			model.addAttribute("msg", "Invalid Credentials...");
			return "loginhw2";
		}
	}
	
	////////////////////////////////////////HOMEWORK3//////////////////////////////////////
	
	@GetMapping(value="/datehw3")
	public String f9()
	{
		return "datehw3";
	}
	
	@GetMapping(value="/getnames")
	public String getBdayInfo(Model model, @RequestParam Date dob1, @RequestParam Date dob2)
	{
		List<BdayTrackerDO> list = template.query("select name , surname from birthday_tracker where dob >='"+dob1+"'and dob <='"+dob2+"'", (rs,rownum)->{return new BdayTrackerDO(rs.getString(1),rs.getString(2));});
	
		model.addAttribute("list", list);
		return "showNamehw3";
		
	}
	
	
	
	
	
	
	
	
	
	
	@Autowired
	MyRepository repo;
	
	
	@RequestMapping(value="/hello1",method=RequestMethod.GET)
	public String home(Model model)
	{
		List<BookEntity> list = repo.findAll();
		model.addAttribute("list",list);
		return "home1";
	}
}
