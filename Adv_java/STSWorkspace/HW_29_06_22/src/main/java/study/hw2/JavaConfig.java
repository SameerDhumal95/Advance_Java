package study.hw2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	
	@Bean(name = "p1")
	public Person getPerson()
	{
		Person p1 = new Person();
		p1.setName("Sameer");
		p1.setAge(26);
		p1.setAddress(getAddress());
		
		return p1;
		
	}
	
	public Address getAddress()
	{
	    Address a = new Address();
	    a.setCity("Pen");
	    a.setPin(70221);
	    return a;
	}
	
	
}
