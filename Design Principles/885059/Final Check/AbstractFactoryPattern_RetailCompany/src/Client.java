
public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryCreator.getFactory();
		System.out.println(factory.createOrder("E-commerce Website", "Electronic"));

		System.out.println(factory.createOrder("E-commerce Website", "Furniture"));

		System.out.println(factory.createOrder("E-commerce Website", "Toy"));
		
		System.out.println(factory.createOrder("Tele caller Agent Application", "Electronic"));

		System.out.println(factory.createOrder("Tele caller Agent Application", "Furniture"));

		System.out.println(factory.createOrder("Tele caller Agent Application", "Toy"));
	}
}
