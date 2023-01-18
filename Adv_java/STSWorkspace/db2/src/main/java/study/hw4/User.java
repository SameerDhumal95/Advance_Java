package study.hw4;
/*4. Create a new project HW30June - add dependencies -spring jdbc data and mysql connector
     write a main class  that shows a menu loop
	 1. add appointment
         2. update appointment purpose
        3. show all appointments 
       4. show appointments for a given user
       5. quit

**date/purpose/category/from/to

Use the appointment table used in the JSP assignment earlier
Use JdbcTemplate  in a DAO bean to access database
	call the DAO bean methods from switch case menu in main
	*/


import java.sql.Date;
import java.sql.Time;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import study.hw4.DAOBeanUsingJdbcTemplate;

public class User {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		DAOBeanUsingJdbcTemplate  bean =  context.getBean("msg",DAOBeanUsingJdbcTemplate.class);
		
		//HW4
	  //  bean.insert(Date.valueOf("2022-05-03"), "assg 4th", "homework", Time.valueOf("10:46:10"),Time.valueOf("10:48:00"));	
	
	//	bean.update();
		
		
	    System.out.println("Inserted...");
	
	    
	    
	}

}