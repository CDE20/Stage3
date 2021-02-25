
public class IndiaCarFactory {

	public Car buildCar(CarType carType) {
		// TODO Auto-generated method stub
		switch(carType){
			case LUXURY:
				return new LuxuryCar(Location.INDIA);
			case MINI:
				return new MiniCar(Location.INDIA);
			case MICRO:
				return new MicroCar(Location.INDIA);
		}
		return null;
	}
}
