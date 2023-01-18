package study.rest;

import java.util.ArrayList;

import javax.websocket.server.PathParam;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/primary")  //classification controller level path
public class MyRestController {

	@GetMapping("/hello") //method level path
	public String f1()
	{
		return "hello from rest controller";
	}
	
	
	@GetMapping("/helloRE") //method level path
	public ResponseEntity<Integer> f10()
	{
		//ResponseEntity<Integer> re = ResponseEntity.ok(100);
		ResponseEntity<Integer> re = ResponseEntity.status(210).body(100);
		return re;
	}
	
	
	
	
	@PostMapping("/postit")
	public String f2()
	{
		return "hi from post";
	}
	
	@PutMapping("/putit")
	public String f3()
	{
		return "hi from put";
	}
	
	@DeleteMapping("/deleteit")
	public String f4()
	{
		return "hi from delete";
	}
	
	@PutMapping("/square")
	public int f5(@RequestParam int num)
	{
		return num*num;
	}
	
	@PostMapping("sum/{n1}/{n2}/{n3}")
	public int f6(@PathVariable("n1")int x,@PathVariable("n2") int y,@PathVariable("n3")int z)
	{
		return x+y+z;
	}
	
	@GetMapping("/welcome")
	public String f7(@RequestBody User n)
	{
		return "welcome " +n.getUname() + " from "+n.getCity();
	}
	
	@GetMapping("/getuser")
	public User f8()
	{
		User u = new User();
		u.setUname("Shubham");
		u.setCity("Mumbai");
		return u;
	}
	
	@GetMapping("/getusers")
	public ArrayList<User> f9()
	{
		ArrayList<User> al = new  ArrayList<User>();
		User u1 = new User();
		u1.setUname("Shubham");
		u1.setCity("Mumbai");
		
		User u2 = new User();
		u2.setUname("Milind");
		u2.setCity("Kolhapur");
		
		al.add(u1);
		al.add(u2);
		
		return al;
		
	}
}
