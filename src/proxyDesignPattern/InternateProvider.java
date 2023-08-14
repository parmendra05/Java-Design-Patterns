package proxyDesignPattern;

public class InternateProvider implements OfficeInternate {

	public String name;
	
	public InternateProvider(String name) {
		super();
		this.name = name;
	}




	@Override
	public void getInternateAccess() {
		
System.out.println("Welcome Mr. "+name+" Thanks for Login Official Internate");
	}

}
