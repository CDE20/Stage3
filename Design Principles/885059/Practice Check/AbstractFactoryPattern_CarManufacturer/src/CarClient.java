
public class CarClient {
	
	public static void main(String[] args) {
		AbstractFactory carFactory = FactoryCreator.getFactory();
		System.out.println(carFactory.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(carFactory.buildCar(CarType.MICRO, Location.USA));
		System.out.println(carFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
	}

}
