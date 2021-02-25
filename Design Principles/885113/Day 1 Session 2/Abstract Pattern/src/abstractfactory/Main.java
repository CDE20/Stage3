package abstractfactory;

public class Main {

	public static void main(String[] args) {
		Factory factory=CarFactory.createCar("Audi");
		Headlight h=factory.makeHeadlight();
		h.getHeadlight();
		Tire t=factory.makeTire();
		t.getTire();
		
		Factory factory1=CarFactory.createCar("Mercedes");
		Headlight h1=factory1.makeHeadlight();
		h1.getHeadlight();
		Tire t1=factory1.makeTire();
		t1.getTire();
	}

}
