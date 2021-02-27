package abstractFactory;

public class LuxuryCar extends Car {

	LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		// TODO Auto-generated constructor stub
		contruct();
	}

	@Override
	protected void contruct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Luxury Car");
	}

}
