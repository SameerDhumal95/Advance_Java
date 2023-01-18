package study.hw3;
/*3. Create a new db2 project same as db project -
	use the same Main class DAOBean and DAOBeanUsingJdbcTemplate
	BUT  instead of using JavaConfig and Annotated class and Autowired annotation - DO ALL the bean CONFIGURATION in beans.XML */


import java.sql.Date;
import java.sql.Time;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class User {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

		DAOBeanUsingJdbcTemplate  bean =  context.getBean("msg",DAOBeanUsingJdbcTemplate.class);
		
	//	bean.insert(101, "laptop", 50000);  HW3
		
		//HW4
	    bean.insert(Date.valueOf("2022-05-02"), "assg 3rd", "homework", Time.valueOf("10:46:10"),Time.valueOf("10:48:00"));	
		
	    System.out.println("Inserted...");
	}

}
