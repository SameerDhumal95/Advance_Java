package study.jparest.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import study.jparest.entity.ProductEntity;
import study.jparest.repositary.MyRepositary;

@RestController
@RequestMapping(path="/jpaex")
public class MyRestController {

	@Autowired
	MyRepositary repo;
	
	@PostMapping("/add/{id}/{name}/{cost}")
	public String insertProduct(@PathVariable int id,@PathVariable String name,@PathVariable int cost)
	{
		ProductEntity obj = new ProductEntity(id,name,cost);
		//repo.save(obj);
		Optional<ProductEntity> obj2 = repo.findById(1);
		if(obj2.isPresent())
		{
			ProductEntity p = obj2.get();
			//...process it here
		}
		return "insert done";
	}
	
	@PostMapping(value = "/insert")
	public void addProduct(@RequestBody ProductEntity p)
	{
		repo.save(p);
	}
	
}
