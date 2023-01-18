package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class Demo2 {

	public static void main(String[] args) {
		
	//SPRING Container is initiated --- t will read beans.xml
	//it will find bean info
	//it will create in object
	//it will set bean properties
	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");//container
	
	//container means contex , usko bean mang rahe hai --getBean
	//kaun si bean --jiska naam msg he
	MessageBean bean1= (MessageBean)context.getBean("msg");
	
	//another way to ask for the bean --we dont have to typecast
	//MessageBean bean1 = context.getBean("msg",MessageBean.class);
	System.out.println("bean1 :"+bean1.getMessage()+"  "+bean1.getSenderName());
	 

	//calling getbean second time
	MessageBean bean2= (MessageBean)context.getBean("msg");
	System.out.println("bean2 :" +bean2.getMessage()+"  "+bean2.getSenderName());
	
	
	bean1.setSenderName("india");
	
	System.out.println("after changing bean 1");
	System.out.println("bean1 :"+bean1.getMessage()+"  "+bean1.getSenderName());
	System.out.println("bean2 :" +bean2.getMessage()+"  "+bean2.getSenderName());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
