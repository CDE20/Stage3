package abstractfactory;

public class CarFactory {
	
	public static Factory createCar(String carname)
	{
		if(carname.equals("Audi"))
		{
			return new AudiFactory();
		}
		else if(carname.equals("Mercedes"))
		{
			return new MercedesFactory();
		}
		else
		{
			return null;
		}
	}
}
