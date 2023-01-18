package part3.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("study.controller")
public class ThymeleafExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafExApplication.class, args);
	}

}
