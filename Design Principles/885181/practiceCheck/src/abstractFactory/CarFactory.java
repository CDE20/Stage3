package abstractFactory;

public class CarFactory {

	public static Car buildCar(CarType type, Location location)
	{
		if(location==Location.INDIA)
		{
			return new IndiaCarFactory().BuildCar(type);
					
		}
		else if(location==Location.USA)
		{
			return new UsaCarFactory().BuildCar(type);
		}
		else if(location==Location.DEFAULT)
		{
			return new DefaultCarFactory().BuildCar(type);
		}
		return null;
	}
	
	

}
