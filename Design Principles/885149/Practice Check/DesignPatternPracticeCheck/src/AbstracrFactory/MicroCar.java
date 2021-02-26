package AbstracrFactory;

public class MicroCar extends Car{

	public MicroCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		System.out.println("Connecting to MIcro Car");
	}

}
