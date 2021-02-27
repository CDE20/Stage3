public class IndiaCarFactory {

	public Car BuildCar(CarType type) {
		if (type.equals(CarType.LUXURY)) {
			return new LuxuryCar(Location.INDIA);
		} else if (type.equals(CarType.MINI)) {
			return new MiniCar(Location.INDIA);
		} else if (type.equals(CarType.MICRO)) {
			return new MicroCar(Location.INDIA);
		}
		return null;
	}
}