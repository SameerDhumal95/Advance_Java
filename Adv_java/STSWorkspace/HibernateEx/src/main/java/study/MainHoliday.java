package study;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.hw2.HolidayDAO;

public class MainHoliday {


	static Session session =null;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		//WE CONFIGURE THE HIBERNATE ORM-------------------
				SessionFactory sessionFactory =null;
				
				//READ the XML 
		        StandardServiceRegistry registry =  new StandardServiceRegistryBuilder().configure().build();
		             // Create MetadataSources
		             MetadataSources sources = new MetadataSources(registry);
		             // Create Metadata
		 
		             //USING XML and Entity  CREATE DDL  
		             Metadata metadata = sources.getMetadataBuilder().build();
		             // Create SessionFactory
		             
		             //GET THE FACTORY
		             sessionFactory= metadata.getSessionFactoryBuilder().build();
		        
		             //ACQUIRE THE SESSION (interface between javacode and hibernate  )
		              session = sessionFactory.openSession();
		            
				    HolidayDAO da=new HolidayDAO();
				int choice=0;
				    
				    do
				    {	int cid;
				    	System.out.println("----Operations List---\n");
				    	System.out.println("1.ADD Holiday");
				    	System.out.println("2.Update Holiday");
				    	System.out.println("3.Delete Holiday");
				    	System.out.println("4.Show HolidaysList");
				    	System.out.println("5.Exist");
				    	

				    	System.out.println("---------------------------------------------------------------------");
				    	System.out.print("Enter your choice : ");

				    	choice=sc.nextInt();
				    	switch(choice)
				    	{
				    	case 1: 
				    		da.addHoliday(session);
				    		break;
				    	case 2: 
				    		System.out.print("Enter  id :");
				    		cid=sc.nextInt();
				    		sc.nextLine();
				    		System.out.println("Enter new HOLIDAY Name: ");
				    		String fname=sc.nextLine();
				    		da.updateHoliday(session ,cid,fname);
				    		break;
				    	case 3: 
				    		System.out.print("Enter  id :");
				    		 cid=sc.nextInt();
				    		da.deleteHoliday(session,cid);
				    		break;
				    	case 4: 
				    		
				    		 da.showHolidays(session);
				    		break;
				    	
				    	default :
				    		System.out.println("INVALID CHOICE.....");
				    	
				    	}
				    }
				    while(choice!=5);
			}




}

