package study.hw3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*3.  Create a new project HW3 using spring starter site
	create a AccountBean having properties acctNo, balance
		annotate the bean with @Component, keep scope prototype
	In main -
		get 2 instances of the AccountBean  , change acctNo and balance, show details of both instances */

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ApplicationContext context = new ClassPathXmlApplicationContext("study/hw3/bean.xml");
//		
//		AccountBean bean =  (AccountBean) context.getBean("acc");
//		
//		System.out.println(bean);
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.scan("study.hw3");
		
		context.refresh();
		
		AccountBean bean =  (AccountBean) context.getBean("acc");
		
		System.out.println(bean);
		
	}

}
