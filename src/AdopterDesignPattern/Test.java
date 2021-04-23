package AdopterDesignPattern;

public class Test {

	public static void main(String[] args) {
		
		BikeMillege duke=new Duke();
		BikeMillegeAdopter adopter=new BikeMillageAdopterImpl(duke);
		double millege= adopter.getMillege();
		System.out.println(millege);
	}

}
