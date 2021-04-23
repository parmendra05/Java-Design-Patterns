package singletonDesignPattern;

public class MySingleton {

	private MySingleton() {}
	private static MySingleton singleton;
	public static MySingleton getInstance() {
		
		if(singleton ==null)return singleton=new MySingleton();
		else return singleton;
	}
	
}
