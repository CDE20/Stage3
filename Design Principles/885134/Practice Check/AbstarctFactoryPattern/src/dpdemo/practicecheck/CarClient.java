package dpdemo.practicecheck;

public class CarClient {

	public static void main(String[] args) {
		System.out.println(Carfactory.buildCar(CarType.MICRO,Location.USA)); 
        System.out.println(Carfactory.buildCar(CarType.MINI,Location.INDIA)); 
        System.out.println(Carfactory.buildCar(CarType.LUXURY,Location.DEFAULT)); 
	}

}
