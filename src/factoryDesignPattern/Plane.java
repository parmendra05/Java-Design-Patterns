package factoryDesignPattern;
//#########   Step -1  #######
public abstract class Plane {
	
	double rate;
	abstract void getRate();
	public void calculateBill(int unit) {
		System.out.println("Toall Bill : Rs. "+rate*unit);
	}

}
