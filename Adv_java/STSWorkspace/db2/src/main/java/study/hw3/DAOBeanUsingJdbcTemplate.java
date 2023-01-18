package study.hw3;




import java.sql.Time;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;




//@Component
public class DAOBeanUsingJdbcTemplate {
	
//	@Autowired
	private JdbcTemplate template;

	public void insert(int pid, String name,int cost)
	{
		//use this for any DML query 
		//using templets
		template.update("insert into product values(?,?,?)", pid,name,cost);
	}

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	

		
	
	public void insert(Date date, String pur,String cat,Time from,Time to)
	{
		//use this for any DML query 
		//using templets
		template.update("insert into appointment values(?,?,?,?,?,default)", date,pur,cat,from,to);
	}
}



