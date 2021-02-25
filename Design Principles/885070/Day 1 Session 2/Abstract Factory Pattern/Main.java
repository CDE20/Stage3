package abstractfactoryhandson;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter name of car:");
		Scanner sc = new Scanner(System.in);
		String car = sc.next();
		Factory f = CarFactoryProvider.createCar(car);
		Headlight h = f.makeHeadLight();
		h.display();
		Tire t = f.makeTire();
		t.display();
		sc.close();
	}
}
