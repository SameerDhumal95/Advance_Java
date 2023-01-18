package study.client;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DAO {

	public Connection myGetConnection()
	{
		Connection con = null;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
	   
		String url ="jdbc:mysql://localhost:3306/ietmar2022";
	    String uname = "root";
	    String pwd = "2022";
		
	    con = DriverManager.getConnection(url,uname,pwd);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println("the connection could not be made "+e);
		}
		return con;
	}
	
	public ResultSet getRows(String sql) 
	{
		Connection con = myGetConnection();
		Statement stmt;
		ResultSet rs = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return rs;
		
	}
	
	public void showResultset(ResultSet rs)
	{
		try {
		while(rs.next())
		{
			int pid = rs.getInt("id");
			String pname = rs.getString("name");
			int cost = rs.getInt(3);  //(3) -->column index or we can give name("cost")
			
			System.out.println("row :"+pid+" , "+pname+" , "+cost);
		}
		}
		catch(SQLException e)
		{
			System.out.println("Problem showing resultset "+e);
		}
	}
	
	public void addProduct(int id, String name,int cost) 
	{
		//get connection
		try {
		Connection con = myGetConnection();
		PreparedStatement psmt = con.prepareStatement("insert into product values(?,?,?)");
        psmt.setInt(1,id);  //1 is question mark no.
        psmt.setString(2,name); //2 is question mark no.
        psmt.setInt(3,cost); 
		psmt.executeUpdate();
		
		//we have used here prepared statement
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}//end of add product
	
	public void updateCost(int id, int cost)
	{
		Connection con = myGetConnection();
		try {
			PreparedStatement psmt = con.prepareStatement("update product set cost=? where id =?");
		
			//set the ? values
			
			psmt.setInt(1, cost);//first ? is cost
			psmt.setInt(2, id);
			
			psmt.executeUpdate();
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	//for stored procedures in database we use callable statement
	public void callHiStoredProc()
	{
		Connection con = myGetConnection();
		try {
		
		CallableStatement cstmt = con.prepareCall("call hi()");
		ResultSet rs = cstmt.executeQuery();
		rs.next();
		String msg = rs.getString("message");
		System.out.println("you got "+msg);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public void callgetNameProc(int id)
	{
		Connection con = myGetConnection();
		try {
			CallableStatement cstmt = con.prepareCall("{ call getName(?,?) }");
			cstmt.registerOutParameter(2, Types.VARCHAR);
			cstmt.setInt(1, id);
			
			cstmt.execute();
			
			String msg = cstmt.getString(2);
			System.out.println("you got "+msg);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
