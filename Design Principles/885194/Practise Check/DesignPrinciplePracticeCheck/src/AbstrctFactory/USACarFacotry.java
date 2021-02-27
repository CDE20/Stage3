package AbstractFactory;

public class USACarFactory extends CarFactory {
	
public Car buildCar(CarType model)
{
	Car car=null;
	switch(model) {
	case LUXURY:
		car=new LuxuryCar(Location.USA);
		break;
	case MICRO:
		car=new MicroCar(Location.USA);
		break;
	case MINI:
		car=new MiniCar(Location.USA);
		break;
	default:
		break;
		
	}
	return car;
	
}
}
