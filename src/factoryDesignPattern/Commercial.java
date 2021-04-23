package factoryDesignPattern;
//#########   Step -2  #######
public class Commercial extends Plane {

	@Override
	void getRate() {
		rate=6.5;
		System.out.println("Rate : Rs. "+rate);
	}

}
