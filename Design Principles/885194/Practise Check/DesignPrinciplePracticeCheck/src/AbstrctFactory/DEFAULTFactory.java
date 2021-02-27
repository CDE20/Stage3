package AbstractFactory;

public class DEFAULTFactory extends CarFactory {
	
public Car buildCar(CarType model)
{
	Car car=null;
	switch(model) {
	case LUXURY:
		car=new LuxuryCar(Location.DEFAULT);
		break;
	case MICRO:
		car=new MicroCar(Location.DEFAULT);
		break;
	case MINI:
		car=new MiniCar(Location.DEFAULT);
		break;
	default:
		break;
		
	}
	return car;
	
}
}
