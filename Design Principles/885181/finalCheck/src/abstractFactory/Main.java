package abstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
          OrderFactory orderFactory= orderFactoryGenerator.getOrder("Ecomm");
            Order order= orderFactory.getOrder("furniture");
            order.processOrder();
            
            OrderFactory orderFactory1= orderFactoryGenerator.getOrder("tele");
            Order order1= orderFactory1.getOrder("toy");
            order1.processOrder();
            
            OrderFactory orderFactory2= orderFactoryGenerator.getOrder("tele");
            Order order2= orderFactory2.getOrder("toy");
            order2.processOrder();
 }
}
