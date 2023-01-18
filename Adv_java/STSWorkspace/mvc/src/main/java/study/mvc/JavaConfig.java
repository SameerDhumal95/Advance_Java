package study.mvc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JavaConfig {

	@Bean
	public JdbcTemplate getTemplate()
	{
		JdbcTemplate obj = new JdbcTemplate();
		obj.setDataSource(getds());  //INJECTED here 
		return obj;
		
	}
	
	
	@Bean
	public DataSource getds()
	{
		DriverManagerDataSource obj = new DriverManagerDataSource();
		obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
		obj.setUrl("jdbc:mysql://localhost:3306/ietmar2022");
		obj.setUsername("root");
		obj.setPassword("2022");
		
		return obj;
	}
	
}