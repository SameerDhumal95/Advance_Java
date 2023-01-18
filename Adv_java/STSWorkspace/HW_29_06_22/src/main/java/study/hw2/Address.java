package study.hw2;

public class Address {

	String city;
	int pin;
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public int getPin() {
		return pin;
	}
	
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
