package templateDesignPattern;

public class Home extends HouseTemplate {

	@Override
	public void doPlasterAndFinishing() {
		System.out.println("house plaster finished");

	}

	@Override
	public void doPaint() {
		System.out.println("house paint finished");

	}
	
	@Override
	public void constructWalls() {
		System.out.println("house wall construction finished");

	}

	@Override
	public void setDoorAndWindows() {
		System.out.println("house door and windows setting finished");

	}

	

}
