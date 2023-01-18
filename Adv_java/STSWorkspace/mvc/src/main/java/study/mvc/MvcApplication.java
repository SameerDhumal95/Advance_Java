package study.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication   //many boiler plate codes are wrapped inside,many configurations
public class MvcApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MvcApplication.class, args);//keep it server run(Embeded tomcat) 
        //when run method is call it will scan all the classes in same package
		
	}

}
