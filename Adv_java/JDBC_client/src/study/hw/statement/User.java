/*HW -----
Write another class study.hw.Client
Main
connection
show menu
1. Insert
2. Update ---- update product set name=varname , cost=varname where id=varname
3. Delete ---- delete from product where id = varname
4. Quit
Fire different queries
Take values from user !!!


*/
package study.hw.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class User {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//url = protocol:dbvendor://ip:portname/dbname
		String url = "jdbc:mysql://localhost:3306/ietmar2022";
		String name = "root";
		String pwd ="2022";
		
		Connection con = DriverManager.getConnection(url,name,pwd);//create connection
		System.out.println(con);
		
		Statement st = con.createStatement();
		
	//	insertSql(st);
		
	//	updateSql(st);
		
		deleteSql(st);

	}
	
	public static void insertSql(Statement st) throws SQLException
	{
		String insert = "insert into product values(9,'joystic',600)";
        st.executeUpdate(insert);
        System.out.println("Record Inserted");
	}
	
	public static void updateSql(Statement st) throws SQLException
	{
		String update = "update product set name ='Mouse' where id = 3";
       // st.executeUpdate(update);
        if(st.executeUpdate(update) == 1)
		System.out.println("Record Updated");
        else
        System.out.println("Invalid");	
	}

	public static void deleteSql(Statement st) throws SQLException
	{
		String delete = "delete from product where id = 12";
       // st.executeUpdate(delete);
        if(st.executeUpdate(delete) == 1)
		System.out.println("Record Deleted");
        else
        System.out.println("Invalid");	
	}
	
}
