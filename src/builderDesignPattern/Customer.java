package builderDesignPattern;

public class Customer {

	public static void main(String[] args) {
		
		//########### Before Facoty Design Pattern  ###########
		
		//Phone ph=new Phone(9999, 5000,"6 GB", "6.5 inches", "128 GB");
		//System.out.println(ph);
		
		
		
		//##############     with builder factory design pattern    ###############
		
		Phone ph=new PhoneBuilder().setBattery(6000).setPrice(9999).getPhone();
		
		System.out.println(ph);
		
		
	}

}
