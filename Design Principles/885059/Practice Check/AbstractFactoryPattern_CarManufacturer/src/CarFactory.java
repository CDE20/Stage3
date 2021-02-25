
public class CarFactory extends AbstractFactory {

	@Override
	public Car buildCar(CarType model, Location location) {
		if (model.equals(CarType.MINI)) {
			return new MiniCar(location);
		} else if (model.equals(CarType.MICRO)) {
			return new MicroCar(location);
		} else if (model.equals(CarType.LUXURY)) {
			return new LuxuryCar(location);
		}
		return null;
	}

}
