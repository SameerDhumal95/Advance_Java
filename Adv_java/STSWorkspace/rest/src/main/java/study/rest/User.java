package study.rest;

public class User {

	private String uname,city;
	
	
	public User()
	{
		System.out.println("User object is created");
	}
	
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}


	
}
