package study.beans;

import org.springframework.stereotype.Component;

@Component  //is a annotation that allows spring to automatically detects our custom bean.
public class PublisherBean {

	private String name, city;
	
	public PublisherBean()
	{
		name="Oreilly publication";
		city="new delhi";
		System.out.println("constructor is call");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
