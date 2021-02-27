package abstractFactory;

public class MiniCar extends Car {

	MiniCar( Location location) {
		super(CarType.MINI, location);
		// TODO Auto-generated constructor stub
		 contruct();
	}

	@Override
	void contruct() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to mini car");
	}

}
