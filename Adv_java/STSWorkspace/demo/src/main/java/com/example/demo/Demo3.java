package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class Demo3 {
 
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		//Typecasting
		MessageBean bean = context.getBean("msg",MessageBean.class);
	
	System.out.println(bean.getMessage()+" sender: "+bean.getSenderName());
	System.out.println("city of receiver : "+bean.getReceiverAddress().getCity());
	}
}
