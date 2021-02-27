package abstractFactory;

public class DefaultCarFactory {
	public Car BuildCar(CarType type) {
		if(type.equals(CarType.LUXURY))
		{
			return new LuxuryCar(Location.DEFAULT);
		}
		else if(type==CarType.MINI)
		{
			return new MiniCar(Location.DEFAULT);
		}
		else if(type==CarType.MICRO)
		{
			return new MicroCar(Location.DEFAULT);
		}
		return null;
	}
}
