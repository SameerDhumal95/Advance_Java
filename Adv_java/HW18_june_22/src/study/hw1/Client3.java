/*1. Write a Java client that gives following Menu
	Do it using study.hw.DAO + PrepareStatement 
	Write main class as study.hw.Client3

	1. update name of a given id
	2. update cost of given id
	3. update both name and cost of given id
	4. delete a record of given
	5. show only the info of row of given id
	6. quit
*/
package study.hw1;

import java.sql.ResultSet;
import java.util.Scanner;

import javax.xml.crypto.Data;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class Client3 {

	public static void main(String[] args) {
		DAO dao = new DAO();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("press 1 for update the name of a given id " + 
		                       "\npress 2 for update the cost of a given id" + 
					           "\npress 3 for update both name and cost of given id" + 
		                       "\npress 4 for delete a record of given id" + 
					           "\npress 5 for show only the info of row of given id" + 
		                       "\npress 6 for quit ");
			
			System.out.println("enter a choice");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1 :
				System.out.println("enter a id");
				int id = sc.nextInt();
				System.out.println("enter a name");
				String name = sc.next();
				dao.updatename(id, name);
				ResultSet rs = dao.getRows("select * from product");
				dao.showResultset(rs);
				break;
				
			case 2 :
				System.out.println("enter a id");
				int id1 = sc.nextInt();
				System.out.println("enter a cost");
				int cost = sc.nextInt();
				dao.updateCost(id1, cost);
				ResultSet rs1 = dao.getRows("select * from product");
				dao.showResultset(rs1);
				break;
				
			case 3 :
				System.out.println("enter a id");
				int id2 = sc.nextInt();
				System.out.println("enter a name");
				String name2 = sc.next();
				System.out.println("enter a cost");
				int cost2 = sc.nextInt();
				dao.updateNameCost(id2, name2, cost2);
				ResultSet rs2 = dao.getRows("select * from product");
				dao.showResultset(rs2);
				break;
				
			case 4 :
				System.out.println("enter a id");
				int id3 = sc.nextInt();
				dao.deleteRec(id3);;
				ResultSet rs4 = dao.getRows("select * from product");
				dao.showResultset(rs4);
				break;
				
			case 5 :
				System.out.println("enter a id");
				int id4 = sc.nextInt();
				dao.showRowInfo(id4);
				ResultSet rs5 = dao.getRows("select * from product where id = "+id4);
				break;
				
			case 6 :
				return;
				
			default :
				System.out.println("INVALID INPUT.....");
				break;
			}
			
		}while(true);

	}

}



