package study.jpa.controller;
/*1. Write a Spring Rest application   --- Use Courses schema used earlier.
	that has a RestController  having following mapping methods
	 1.  GET  /allCourses    - use Spring-JPA to return all Courses 
	2.  POST  /addCourse  --- send a RequestBody with all course details and insert the record in the DB
	3. PUT    /change/{courseName}/{facultyName} 
		  change facultyName for all records matching the courseName
	4. DELETE  /removecourse/{courseId}   remove the Course */

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import study.jpa.CourseEntity;
import study.jpa.ProductEntity;
import study.jpa.repository.MyRepository;
import study.jpa.repository.ProductRepo;

@CrossOrigin
@RestController
public class MyRestController {

	@Autowired
	MyRepository repo;
	@Autowired
	ProductRepo repo2;
	
	@PostMapping("/addCourse")
	public String addCourse(@RequestBody CourseEntity c)
	{
		repo.save(c);
		return "Successfully Inserted..";
	}
	
	
	@PostMapping("/insert")
	public String addProduct(@RequestBody ProductEntity p)
	{
		repo2.save(p); 
		return p.getName()+" Successfully added";
	}
	
	@GetMapping("/get")
	public List<ProductEntity> showList()
	{
		List<ProductEntity> list = repo2.findAll();
		return list;
		
	}
	
	@DeleteMapping("/delete")
	public String deleteProduct(@RequestParam int id) 
	{
		
		repo2.deleteById(id);
		return id+ " Deleted";
	}
	
	@PutMapping("/put/{id}/{name}")
	public String updateName(@PathVariable int id,@PathVariable String name)
	{
		ProductEntity p = repo2.findById(id).get();
		p.setName(name);
		repo2.save(p);
		return "Updated record...";
		
		
	}
}
