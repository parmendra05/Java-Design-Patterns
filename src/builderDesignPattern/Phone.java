package builderDesignPattern;

public class Phone {
	
	int price;
	int battery;
	String ram;
	String screanSize;
	String storage;
	public Phone(int price, int battery, String ram, String screanSize, String storage) {
		super();
		this.price = price;
		this.battery = battery;
		this.ram = ram;
		this.screanSize = screanSize;
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Phone [Price=" + price + ", Battery=" + battery + ", RAM=" + ram + ", Screan-Size=" + screanSize
				+ ", Storage=" + storage + "]";
	}
	
	

}
