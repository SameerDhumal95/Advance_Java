package study.beans;

public class MessageBean {

	
	private String message,senderName;
	
	private AddressBean receiverAddress;
	
	public AddressBean getReceiverAddress() {
		return receiverAddress;
	}
	
	public void setReceiverAddress(AddressBean receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	
	//default constructor
	public MessageBean()
	{
		System.out.println("Message bean default constructor called --that means instance is created");
	}
	
	public MessageBean(AddressBean receiverAddress)
	{
		System.out.println("Message bean constructor with 1 parameter");
		message="Have a good day";
		senderName="Chota Bheem";
		this.receiverAddress=receiverAddress;
	}
	
	
	//parameterized constructor
	public MessageBean(String message, String senderName, AddressBean receiverAddress) {
		super();
		
		System.out.println("Message bean constructor with 3 parameter");
		this.message = message;
		this.senderName = senderName;
		this.receiverAddress = receiverAddress;
	}

	public String getMessage()
	{
		return message;
	}
	
	public void setMessage(String message)
	{
		System.out.println("setMessage is called");
		this.message = message;
	}

	public String getSenderName() {
		// TODO Auto-generated method stub
		return senderName;
	}
	
	public void setSenderName(String senderName) {
		// TODO Auto-generated method stub
		System.out.println("setSender called");
		this.senderName=senderName;
	}
}
