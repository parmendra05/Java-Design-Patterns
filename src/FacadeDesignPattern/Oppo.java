package FacadeDesignPattern;

public class Oppo implements MobileShop {

	@Override
	public void mobileName() {
		System.out.print("Oppo A51  :" );

	}

	@Override
	public void price() {
		System.out.println("Rs. "+15000);

	}

}
