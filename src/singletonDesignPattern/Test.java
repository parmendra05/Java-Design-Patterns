package singletonDesignPattern;

public class Test {

	public static void main(String[] args) {
		MySingleton ms = MySingleton.getInstance();
		MySingleton ms2 = MySingleton.getInstance();
		// MySingleton ms3=new MySingleton(); // not allowed due to private constructor

		System.out.println(ms.hashCode());
		System.out.println(ms2.hashCode());

	}

}
