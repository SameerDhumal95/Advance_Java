package study.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import study.jpa.UserEntity;
import study.jpa.repository.UserRepository;


@RestController
public class UserMyRestController {

	@Autowired
	UserRepository repo;

	@GetMapping("/adduser")
	public String addUser(@RequestBody UserEntity u)
	{
		repo.save(u);
		return "Successfully Updated..";
	}

	@GetMapping("/showusers")
	public List<UserEntity> showUsers()
	{
		List<UserEntity> list = repo.findAll();

		return list;
	}

	@PutMapping("/changepass/{uname}/{oldpwd}/{newpwd}")
	public String changePass(@PathVariable String uname,@PathVariable String oldpwd,@PathVariable String newpwd)
	{
		List<UserEntity> list = repo.findAll();

		for(UserEntity u : list)
		{
			if(u.getUname().equals(uname) && u.getPass().equals(oldpwd))
			{
				u.setPass(newpwd);
				repo.saveAll(list);
				return "Updated Successfully..";
			}

		}
		return "Invalid..";


	}

	@DeleteMapping("/removeuser/{uname}/{pwd}")
	public String deleteUser(@PathVariable String uname,@PathVariable String pwd)
	{
		List<UserEntity> list = repo.findAll();

		for(UserEntity u : list)
		{
			if(u.getUname().equals(uname) && u.getPass().equals(pwd))
			{
				repo.delete(u);
				return "Deleted Successfully..";
			}

		}
		return "Invalid..";
	}
}
