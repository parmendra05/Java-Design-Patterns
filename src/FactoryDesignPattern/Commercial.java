package FactoryDesignPattern;

//#########   Step -2  #######
public class Commercial extends Bill_Planner {

	@Override
	void getRate() {
		rate = 6.5;
		System.out.println("Rate per unit for Commercial : " + rate);
	}

}
