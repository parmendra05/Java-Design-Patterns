package ProxyDesignPattern;

public class ProxyInternate implements OfficeInternate {

	private String name;
	private InternateProvider provider;
	
	public ProxyInternate(String name) {
		this.name = name;
	}

	@Override
	public void getInternateAccess() {
	if(checkElligible(name) >5) {
		provider =new InternateProvider(name);
		 provider.getInternateAccess();
	}	else System.out.println("you are not elligible for official Internate");

	}
	
	public int checkElligible(String name) {
		// data will be return from database for this Imployee
		return 2;
	}

}
