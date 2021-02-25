
public class DefaultCarFactory {

	public Car buildCar(CarType carType) {
		// TODO Auto-generated method stub
		switch(carType){
			case LUXURY:
				return new LuxuryCar(Location.DEFAULT);
			case MINI:
				return new MiniCar(Location.DEFAULT);
			case MICRO:
				return new MicroCar(Location.DEFAULT);
		}
		return null;
	}
}
