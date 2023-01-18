package study.hw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hw290622Application {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		ProductBean bean =  (ProductBean)context.getBean("msg");
		
		System.out.println(bean);
		
		ProductBean bean1 =  (ProductBean)context.getBean("msg");
		
		bean1.setCost(500);
		
		System.out.println(bean1);
		
	   
		
        ProductBean bean2 =  (ProductBean)context.getBean("msg1");
	
		System.out.println(bean2);
	}

}
