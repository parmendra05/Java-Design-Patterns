package factoryDesignPattern;

//#########   Step -2  #######
public class Domestic extends Bill_Planner {

	@Override
	void getRate() {
		rate = 3.5;
		System.out.println("Rate per unit for Domestic : " + rate);
	}

}
