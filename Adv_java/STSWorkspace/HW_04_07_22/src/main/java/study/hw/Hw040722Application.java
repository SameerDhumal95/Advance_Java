package study.hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"study.controller","study.hw2"})
public class Hw040722Application {

	public static void main(String[] args) {
		SpringApplication.run(Hw040722Application.class, args);
	}

}
