package study.data;

import java.util.Date;

public class TaskInfo {
	Date date;
	String taskInfo;
	
	
	public TaskInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public TaskInfo(Date date, String taskInfo) {
		super();
		this.date = date;
		this.taskInfo = taskInfo;
	}

	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getTaskInfo() {
		return taskInfo;
	}
	
	public void setTaskInfo(String taskInfo) {
		this.taskInfo = taskInfo;
	}
	
	@Override
	public String toString() {
		return "TaskInfo [date=" + date + ", taskInfo=" + taskInfo + "]";
	}
}