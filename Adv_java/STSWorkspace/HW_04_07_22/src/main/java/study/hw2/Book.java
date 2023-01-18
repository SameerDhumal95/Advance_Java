package study.hw2;

public class Book {

	
	String bookName,autherName;
	int cost;
	
	
	
	public Book(String bookName, String autherName, int cost) {
		super();
		this.bookName = bookName;
		this.autherName = autherName;
		this.cost = cost;
	}
	
	
	
	public Book() {
		super();
		
	}



	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAutherName() {
		return autherName;
	}
	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
