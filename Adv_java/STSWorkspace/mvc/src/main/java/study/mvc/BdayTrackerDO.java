package study.mvc;

import java.sql.Date;

public class BdayTrackerDO {
	
	private int id;
	private String name,surname;
	Date dob;
	
	public BdayTrackerDO()
	{
		
	}

	public BdayTrackerDO(int id) 
	{
		this.id = id;
	}
	
	public BdayTrackerDO(String name, String surname)
	{
		this.name=name;
		this.surname=surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		
		String str = "  "+name+"  "+surname+"\n";
		return str;
	}
	

}