
public class CarFactory{

	public CarFactory(CarType model, Location location) {
		//super(model, location);
		//construct();
	}

	

	public static Car buildCar(CarType carType, Location location) {
		// TODO Auto-generated method stub
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
