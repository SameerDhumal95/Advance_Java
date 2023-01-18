package study.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import study.DO.ProductDO;





@Component //@Repository
public class DAOBean {

	@Autowired
	private DataSource ds;
	
	public void insert(int pid,String name,int cost) 
	{
		try {
			Connection con = ds.getConnection();
			
			PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
			pstmt.setInt(1, pid);
			pstmt.setString(2, name);
			pstmt.setInt(3, cost);			
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void showAllRecords()
	{
		//complete it in the LAB
	}
	
	
	//insted of inserting single row 
	
	public List<ProductDO>  getProducts()
	{
		List<ProductDO>  list = new ArrayList<ProductDO>();
		try {
			Connection con = ds.getConnection();

			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from product");
			while(rs.next())
			{
				ProductDO obj = new ProductDO();
				obj.setPid(rs.getInt(1));
				obj.setPname(rs.getString(2));
				obj.setPcost(rs.getInt(3));
				
				list.add(obj);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}