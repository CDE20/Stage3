package abstractFactory;

public class MicroCar extends Car {

	MicroCar( Location location) {
		super(CarType.MICRO, location);
		// TODO Auto-generated constructor stub
		contruct();
	}

	@Override
	void contruct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to Micro Car");
	}

}
