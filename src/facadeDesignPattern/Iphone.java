package facadeDesignPattern;

public class Iphone implements MobileShop {

	@Override
	public void mobileName() {
		System.out.print("Iphone 14 :");

	}

	@Override
	public void price() {
		System.out.println("Rs. " + 79000);

	}

}
