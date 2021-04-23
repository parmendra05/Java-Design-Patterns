package factoryDesignPattern;

//#########   Step -3  #######

public class GetPlaneFactory {

	public Plane getPlane(String planeType) {
		
		if(planeType==null)return null;
		
		else if (planeType.equalsIgnoreCase("Commercial")) return new Commercial();
		
		else if (planeType.equalsIgnoreCase("Domestic")) return new Domestic();
		
		return null;
	}
	
}
