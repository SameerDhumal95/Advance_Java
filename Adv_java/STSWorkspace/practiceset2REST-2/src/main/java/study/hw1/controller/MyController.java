package study.hw1.controller;

import java.awt.print.Book;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.hw1.entity.BookEntity;
import study.hw1.repository.MyRepository;

@Controller
public class MyController {

	@Autowired
	MyRepository repo;
	
	@PostMapping("/add/{name}")
	public String add(@PathVariable String name)
	{
		BookEntity book = new BookEntity();
		book.setBname(name);
		repo.save(book);
		return "inserted book...";
	}
	
	@RequestMapping(value="/hello1",method=RequestMethod.GET)
	public String home(Model model)
	{
		List<BookEntity> list = repo.findAll();
		model.addAttribute("list",list);
		return "home1";
	}
	

//	@RequestMapping(value="/output",method=RequestMethod.POST)
//	public void remove(@RequestParam String bname)
//	{
//		BookEntity b =  (BookEntity) repo.findByName(bname);
//		
//		repo.delete(b);
//
//
//	}
}
