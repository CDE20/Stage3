package AbstractFactory;

public abstract class CarFactory {
	public static Car buildCar(CarType model,Location location) {
		Car car=null;
		switch(location)
		{
		case USA:
			car=new USACarFactory().buildCar(model);
			break;
		case INDIA:
			car=new INDIACarFactory().buildCar(model);
			break;
		case DEFAULT:
			car=new DEFAULTFactory().buildCar(model);
			break;
		default:
			break;
		}
		return car;
	}
}
