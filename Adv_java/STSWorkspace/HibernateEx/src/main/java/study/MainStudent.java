package study;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import study.entity.StudentEntity;

public class MainStudent {
	
	static Session session = null; 
    
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
            
  //            updateex();
              //deleteex();
              
                insertex();
  //            selectex();

}

public static void insertex()
{
	StudentEntity obj = new StudentEntity(3,87,"as","sgfd");
    
    Transaction tx = session.beginTransaction();
    session.save(obj);
    tx.commit();
    
}

 public static void updateex()
 {
	 Transaction tx = session.beginTransaction();
	StudentEntity dbRow = session.get(StudentEntity.class, 1);
		dbRow.setRollNumber(205);;
	tx.commit();
	
	
 }

 public static void deleteex()
 {
	 Transaction tx = session.beginTransaction();
		StudentEntity dbRow = session.get(StudentEntity.class, 1);
			session.delete(dbRow);
		tx.commit();
 }

 public static void selectex()
 {
	 //WE ARE FIRING HQL =  Hibernate Query Language 
	  Query<StudentEntity> q  = session.createQuery("from study.entity.StudentEntity");
	  q.list().stream().forEach((row)->{System.out.println(row);});
	 
 }


}