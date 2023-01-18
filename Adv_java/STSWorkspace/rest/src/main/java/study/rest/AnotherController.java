package study.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/another")
public class AnotherController {

	@GetMapping("/hello")
	public String f1()
	{
		return "another rest controller" ;
	}
	@PostMapping("/postit")
	public String f2()
	{
		return "hi another from post";
	}
}
