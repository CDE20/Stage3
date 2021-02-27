package abstractFactory;

public class IndiaCarFactory {
	
public Car BuildCar(CarType carType) {
	if(carType==CarType.LUXURY)
	{
		return new LuxuryCar(Location.INDIA);
	}
	else if(carType==CarType.MINI)
	{
		return new MiniCar(Location.INDIA);
	}
	else if(carType==CarType.MICRO)
	{
		return new MicroCar(Location.INDIA);
	}
	return null;
}

}