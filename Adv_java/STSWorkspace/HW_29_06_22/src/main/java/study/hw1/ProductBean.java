package study.hw1;

public class ProductBean {

	String name,desc;
	int cost;
	
	
	@Override
	public String toString() {
		return "ProductBean [name=" + name + ", desc=" + desc + ", cost=" + cost + "]";
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
