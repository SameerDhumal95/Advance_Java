package study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
@Lazy
public class BookBean {

	private String name;
	private double cost;
	
	@Autowired
	private PublisherBean publisher;
	
	public PublisherBean getPublisher() {
		return publisher;
	}
	
	public void setPublisher(PublisherBean publisher) {
		this.publisher = publisher;
	}
	
	//container will have to use this constructor to create BookBean
	//Container Must pass parameter to the constructor i.e. PublisherBean
	//Container searches for another bean of type PublisherBean and inject it
	
	//@Autowired --we can write @Autowired on the property or either on constructor
	public BookBean(PublisherBean publisher) {
		super();
		this.name="the goal";
		this.cost=300;
		this.publisher = publisher;
		System.out.println("Constructor with 1 parameter publisher bean");
	}


	public BookBean()
	{
		setName("20 thousand leagues under the sea");
		setCost(300);
		System.out.println("book bean default constructors...");
		
	}

	//@Autowired ---this cannot happened because the two parameter are not beans
	public BookBean(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
		System.out.println("book bean constructors with 2 parameters");
		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
