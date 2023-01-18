package study.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jpa.Planner;
import study.jpa.repository.MyRepository;

@RestController
@RequestMapping(path = "/plan")
public class MyRestController {

	@Autowired
	MyRepository repo;
	
	@GetMapping("/allplan")
	public List<Planner> showlist()
	{
		List<Planner> list = repo.findAll();

		return list;
	}
	
}
