package AbstracrFactory;

public class CarFactory {
	
	public static Car buildCar(CarType model,Location location) {
		Car car=null;
		switch(location) {
		case DEFAULT:
			car=DefaultCarFactory.buildCar(model);
			break;
		case INDIA:
			car= IndiaCarFactory.buildCar(model);
			break;
		case USA: 
			car=USACarFactory.buildCar(model);
			break;
		}
		return car;
	}

}
