package study.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import study.DO.ProductDO;


@Component
public class DAOBeanUsingJdbcTemplate {
	
	@Autowired
	private JdbcTemplate template;

	public void insert(int pid, String name,int cost)
	{
		//use this for any DML query 
		//using templets
		template.update("insert into product values(?,?,?)", pid,name,cost);
	}
	
	public List<ProductDO>  getProducts()
	{
		List<ProductDO> list =template.query("select * from product",(rs,rownum)->{ return new ProductDO(rs.getInt(1),rs.getString(2),rs.getInt(3));} );
		return list;
	}
		
}



