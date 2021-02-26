package AbstracrFactory;

public class CarCliet {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar(CarType.MINI, Location.INDIA));
		System.out.println(CarFactory.buildCar(CarType.MICRO, Location.DEFAULT));
		System.out.println(CarFactory.buildCar(CarType.LUXURY, Location.INDIA));
	}

}
