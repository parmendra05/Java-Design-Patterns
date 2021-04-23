package FacadeDesignPattern;

public class Iphone implements MobileShop {

	@Override
	public void mobileName() {
		System.out.print("Iphone 8 :");

	}

	@Override
	public void price() {
		System.out.println("Rs. "+49000);

	}

}
