package study.controller;

/*1. Write a REST CONTROLLER having controller level mapping /maths

   GET    /maths/factorial?num= give value  response = factorial of that number
   GET   /maths/table/{ofnum}/{from}/{to}        response  =   coma separated table Ex table of 2 from 1 to 5  =  2,4,6,8,10
   GET   /maths/isPrime/{num}     response =  The number 7 is prime    /  The number 8 is not prime
*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/maths")
public class MyWebController {

	
	@GetMapping("/fact")
	public int getFactorial(@RequestParam int num)
	{
		int fact = 1;
		for(int i=num; i>0; i--)
		{
			fact = fact * i;
		}
		return fact;
		
	}
	
	@GetMapping("/table/{ofnum}/{from}/{to}")
	public String getTable(@PathVariable("ofnum") int num,@PathVariable int from,@PathVariable int to)
	{
		String str="";
		for(int i =from ; i<=to; i++)
		{
			str = str + num * i  + " , ";
		}
		
		return str;
	}
	
	@GetMapping("/prime/{num}")
	public String isPrime(@PathVariable int num)
	{
		for(int i=2; i<num/2; i++)
		{
			if(num%i==0)
			{
				return "not prime";
			   
			}
			
		}
		if(num==1)
		{
			return "1 is neither prime nor composit";
		}
		return "prime";
		
	}
}
