package study.hw.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DAO {

	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ietmar2022";
			String name = "root";
			String pwd ="2022";
			
			Connection con = DriverManager.getConnection(url,name,pwd);//create connection
			return con;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	public void updateName()
	{
		Connection con= getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("update product set name = ? where id =?");
			pst.setString(1,"RAM");
			pst.setInt(2, 11);
			pst.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void delete() 
	{
		Connection con= getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("delete from product where id = ?");
			
			pst.setInt(1, 11);
			pst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void show()
	{
		Connection con= getConnection();
		try {
			PreparedStatement pst = con.prepareStatement("select * from product where id = ?");
			
			pst.setInt(1, 9);
			ResultSet rs = pst.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1)+" "+rs.getString("name")+" "+rs.getInt("cost"));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
