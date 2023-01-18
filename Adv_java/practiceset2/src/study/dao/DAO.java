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
	
	public void showResultset(ResultSet rs)
	{	try {
		while(rs.next())
		{
			int pId = rs.getInt("id");
			String pName = rs.getString("name");
			int cost = rs.getInt(3);		
			System.out.println("row :  "+pId+","+pName+","+cost);
		}
		}catch(SQLException e)
		{
			System.out.println("problem showing resultset "+e);
		}
	}
	
	public void addKid(String fname,String lname,int age)
	{
		Connection con = myGetConnection();
		try {
PreparedStatement pstmt = con.prepareStatement("insert into kid_table values(default,?,?,?)");
		pstmt.setString(1,fname); // 1 is question mark 1
		pstmt.setString(2,lname); //internally single quote added or not if null
		pstmt.setInt(3,age);
		pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//add product
	
	public void addAdult(String fname,String lname,int age)
	{
		Connection con = myGetConnection();
		try {
PreparedStatement pstmt = con.prepareStatement("insert into adult_table values(default,?,?,?)");
		pstmt.setString(1,fname); // 1 is question mark 1
		pstmt.setString(2,lname); //internally single quote added or not if null
		pstmt.setInt(3,age);
		pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//add product
	
	public void updateCost(int id, int cost)
	{
		Connection con = myGetConnection();
		try {
PreparedStatement pstmt = con.prepareStatement("update product set cost=? where id=?");

		//set the ? values
		pstmt.setInt(1, cost);
		pstmt.setInt(2, id);

		pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void callHiStoredProc()
	{
		Connection con = myGetConnection();
		try {
			CallableStatement cstmt = con.prepareCall("call hi()");
			ResultSet rs = cstmt.executeQuery();
			rs.next();
			String msg = rs.getString("message");
			System.out.println("you got "+msg);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*	
	mysql> create procedure getName( IN pid int , OUT pname varchar(100) )
    -> begin
    -> select name into pname from product where id=pid;
    -> end//
Query OK, 0 rows affected (0.11 sec)
*/
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
	