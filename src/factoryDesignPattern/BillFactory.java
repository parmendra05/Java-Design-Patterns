package factoryDesignPattern;

//#########   Step -3  #######

public class BillFactory {

	public Bill_Planner getPlan(String planType) {
		
		if(planType==null)return null;
		
		else if (planType.equalsIgnoreCase("Commercial")) return new Commercial();
		
		else if (planType.equalsIgnoreCase("Domestic")) return new Domestic();
		
		return null;
	}
	
}
