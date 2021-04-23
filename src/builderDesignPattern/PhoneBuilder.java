package builderDesignPattern;

public class PhoneBuilder {

	int price;
	int battery;
	String ram;
	String screanSize;
	String storage;
	
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreanSize(String screanSize) {
		this.screanSize = screanSize;
		return this;
	}
	public PhoneBuilder setStorage(String storage) {
		this.storage = storage;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(price, battery, ram, screanSize, storage);
	}
	
}
