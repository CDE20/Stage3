package dpdemo.practicecheck;

public class Carfactory extends Car {

	public Carfactory(CarType model, Location location) {
		super(model, location);
		construct();
	}

	@Override
	void construct() {

	}

	public static Car buildCar(CarType carType, Location location) {
		
		switch (location) {
			case USA:
				return new USACarFactory().buildCar(carType);
			case INDIA:
				return new IndiaCarFactory().buildCar(carType);
			case DEFAULT:
				return new DefaultCarFactory().buildCar(carType);
		}
		return null;
	}

}
