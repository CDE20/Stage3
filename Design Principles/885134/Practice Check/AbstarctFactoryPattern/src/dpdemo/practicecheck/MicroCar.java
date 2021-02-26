package dpdemo.practicecheck;

public class MicroCar extends Car{
	
	MicroCar(Location location) 
    { 
        super(CarType.MICRO, location); 
        construct(); 
    } 
	@Override
	void construct() {
		System.out.println("Connecting to micro car");
	}

}
