package study;

import java.util.Scanner;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import study.entity.StudentEntity;
import study.hw1.CoursesDAO;

public class MainCourses {
	
	//static Session session =null;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		//WE CONFIGURE THE HIBERNATE ORM-------------------
		SessionFactory sessionFactory =null;//connection
         
		
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
		Session session = sessionFactory.openSession();

		CoursesDAO cd = new CoursesDAO();
		
		//cd.addCourse(session);
          cd.showCourses(session);
		// session.close();

/*		
	//durgesh technique	
	//practice 	
	Configuration cfg = new Configuration();
    cfg.configure("hibernate.cfg.xml");
    SessionFactory factory = cfg.buildSessionFactory();
    
    //creating student
    StudentEntity st = new StudentEntity();
    
    st.setFirstName("Sameer");
    st.setLastName("Dhumal");
    st.setRollNumber(89);
    st.setId(1);
    
    System.out.println(st);
    
    Session s = factory.openSession();
    
   org.hibernate.Transaction tx = s.beginTransaction();
    
    s.save(st);
    
    tx.commit();
    
    
    s.close();
    
    System.out.println(factory);
    System.out.println(factory.isClosed());
    
 */   
	
	
	}

}
