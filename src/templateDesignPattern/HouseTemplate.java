package templateDesignPattern;

public abstract class HouseTemplate {

	// this method is final, so we can't change the order or re-implement
	public final void buildHouse() {
		constructBasement();
		constructWalls();
		setDoorAndWindows();
		doPlasterAndFinishing();
		doPaint();

	}

	public void constructBasement() {
		System.out.println("Basement Construction Complited");
	}

	public abstract void constructWalls();

	public abstract void setDoorAndWindows();

	public abstract void doPlasterAndFinishing();

	public abstract void doPaint();

}
