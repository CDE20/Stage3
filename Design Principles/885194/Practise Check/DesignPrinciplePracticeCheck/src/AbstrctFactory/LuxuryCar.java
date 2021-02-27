package AbstractFactory;

public class LuxuryCar extends Car{
	
	public LuxuryCar(Location location)
	{
		super(CarType.LUXURY,location);
		construct();
	}
	
	public void construct() {
		System.out.println("Connecting to luxury car");
	}

}
