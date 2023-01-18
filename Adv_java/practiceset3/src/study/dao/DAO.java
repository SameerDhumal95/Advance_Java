package study.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DAO {

	public Connection myGetConnection()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/ietmar2022";
			String uname ="root";
			String pwd = "2022";

			con = DriverManager.getConnection(url, uname, pwd);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("the connection could not be made....."+e);
		}
		return con;
	}

	public ResultSet getRows(String sql)
	{
		Connection con = myGetConnection();
		ResultSet rs = null;
		Statement stmt;
		try {
			stmt = con.createStatement();
			rs =stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return rs;
	}

	//	public void showResultset(ResultSet rs)
	//	{	try {
	//		while(rs.next())
	//		{
	//			int pId = rs.getInt("id");
	//			String pName = rs.getString("name");
	//			int cost = rs.getInt(3);		
	//			System.out.println("row :  "+pId+","+pName+","+cost);
	//		}
	//		}catch(SQLException e)
	//		{
	//			System.out.println("problem showing resultset "+e);
	//		}
	//	}

	public void addCustomer(String fname,String lname,String address)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into customer_info_tbl values(default,?,?,?)");

			pstmt.setString(1,fname); //internally single quote added or not if null
			pstmt.setString(2,lname);
			pstmt.setString(3,address);
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}//add product
}



