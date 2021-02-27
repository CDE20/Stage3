package AbstractFactory;

public class INDIACarFactory extends CarFactory {
	
public Car buildCar(CarType model)
{
	Car car=null;
	switch(model) {
	case LUXURY:
		car=new LuxuryCar(Location.INDIA);
		break;
	case MICRO:
		car=new MicroCar(Location.INDIA);
		break;
	case MINI:
		car=new MiniCar(Location.INDIA);
		break;
	default:
		break;
		
	}
	return car;
	
}
}
