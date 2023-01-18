package com.cdac.db;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import study.beans.DAOBean;
import study.beans.DAOBeanUsingJdbcTemplate;

public class DbApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext();//
		context.scan("study.beans","com.cdac.db.config");
		context.refresh();
		
//		DAOBean bean =context.getBean(DAOBean.class);
//		bean.insert(989, "Apple laptop", 150000);
		
		
		DAOBeanUsingJdbcTemplate bean2 = context.getBean(DAOBeanUsingJdbcTemplate.class);
		bean2.insert(1000, "Soundbar", 9000);
		
		
		bean2.getProducts().stream().forEach((p)->{System.out.println(p);});
		
		
		
		
	}

}