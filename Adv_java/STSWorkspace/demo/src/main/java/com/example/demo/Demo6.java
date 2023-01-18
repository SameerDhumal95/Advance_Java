package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.beans.MessageBean;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageBean bean = context.getBean("msg4",MessageBean.class);
		
		System.out.println(bean.getSenderName()+"  msg: "+bean.getMessage()+"  city: "+bean.getReceiverAddress().getCity());
		
		
	}

}
