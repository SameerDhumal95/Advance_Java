package study.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//class is loaded from jar to Ram
		Class.forName("com.mysql.cj.jdbc.Driver");
	    String url ="jdbc:mysql://localhost:3306/ietmar2022";
	    String uname = "root";
	    String pwd = "2022";
	    
	    //connection
	    Connection con = DriverManager.getConnection(url, uname, pwd);
	    
	    //System.out.println(con);
	    
	    //insert record through java program
	    Statement stml = con.createStatement(); //only one time for creating the object
	    //it gives us the object of subclass of statement
	    
	    Scanner sc =new Scanner(System.in);
	    int id = sc.nextInt();
	    String name = sc.next();
	    int cost = sc.nextInt();
	    String sql = "insert into product values("+id+",'"+name+"',"+cost+")";
	    stml.executeUpdate(sql);
	    
	    System.out.println("Record Inserted");
		
	}
}
/*

There are different types of statements that are used in JDBC as follows:

Create Statement
Prepared Statement
Callable Statement


 Create a Statement: From the connection interface, you can create the object for this interface.
 
 Prepared Statement: represents a recompiled SQL statement, that can be executed many times. 
  This accepts parameterized SQL queries. In this, �?� is used instead of the parameter, 
  one can pass the parameter dynamically by using the methods of PREPARED STATEMENT at run time.
  
  executeQuery(): Returns a ResultSet from the current prepared statement.
  executeUpdate(): Returns the number of rows affected by the DML statements such as INSERT,
                   DELETE, and more that is present in the current Prepared Statement.
*/