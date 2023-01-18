package study.hw2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("study.hw2")
public class MyJavaConfig {

	@Bean("ds")
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/ietmar2022");
		ds.setUsername("root");
		ds.setPassword("2022");
		
		return ds;
	}
	
	@Bean("jdbc")
	public JdbcTemplate getJDBCTemplate()
	{
		JdbcTemplate jdbc = new JdbcTemplate();
		jdbc.setDataSource(getDataSource());
		return jdbc;
	}
}
