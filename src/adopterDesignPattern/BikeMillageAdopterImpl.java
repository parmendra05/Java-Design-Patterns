package adopterDesignPattern;

public class BikeMillageAdopterImpl implements BikeMillegeAdopter {

	private BikeMillege bikeMillege;

	public BikeMillageAdopterImpl() {
	}

	public BikeMillageAdopterImpl(BikeMillege bikeMillege) {
		this.bikeMillege = bikeMillege;
	}

	private double millegeConverter(double mpl) {
		return mpl * 1.6;
	}

	@Override
	public double getMillege() {

		return millegeConverter(bikeMillege.getMillege());
	}

}
