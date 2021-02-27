package abstractFactory;

public class UsaCarFactory {
	public Car BuildCar(CarType type) {
	if(type==CarType.LUXURY)
	{
		return new LuxuryCar(Location.USA);
	}
	else if(type==CarType.MINI)
	{
		return new MiniCar(Location.USA);
	}
	else if(type==CarType.MICRO)
	{
		return new MicroCar(Location.USA);
	}
	return null;
 }
}