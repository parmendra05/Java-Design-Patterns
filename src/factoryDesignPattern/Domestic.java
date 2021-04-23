package factoryDesignPattern;
//#########   Step -2  #######
public class Domestic extends Plane {

	@Override
	void getRate() {
		rate=3.5;
System.out.println("Rate : Rs. "+rate);
	}

}
