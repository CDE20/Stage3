package abstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	OrderFactory og=new OrderFactory();
      //  Order order=new Order();
		Order order= orderFactoryGenerator.getOrder("Ecomm","furniture");
          order.processOrder();
          
          Order order1= orderFactoryGenerator.getOrder("tele","toy");
          order1.processOrder();
          
          Order order2= orderFactoryGenerator.getOrder("Ecomm","electronic");
          order2.processOrder();
 }
}