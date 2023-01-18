package study.hw2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class User {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
	    Person p1 =  context.getBean("p1",Person.class);
	  //  Person p1 =  (Person) context.getBean("p1");
	    
	    System.out.println(p1);
	}

}
