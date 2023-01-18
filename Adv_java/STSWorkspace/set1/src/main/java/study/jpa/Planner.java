package study.jpa;

import java.sql.Date;

public class Planner {

	private String task_info;
	private Date date;
	
	public Planner()
	{
		
	}
	
	public Planner(String task_info, Date date) {
		super();
		this.task_info = task_info;
		this.date = date;
	}

	public String getTask_info() {
		return task_info;
	}

	public void setTask_info(String task_info) {
		this.task_info = task_info;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		
		 String str =  "Planner [   task_info = " + task_info + " , Date = " + date + " ]";
		 
		 return str;
	}
	
	
}
