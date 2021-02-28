public class Main {
	public static void main(String args[]) {
		
		System.out.println(OrderFactory.CreateOrder(ProductType.ELECTRONIC, Channel.ECOMMERCE));
		System.out.println(OrderFactory.CreateOrder(ProductType.FURNITURE, Channel.TELE_CALLER));
		System.out.println(OrderFactory.CreateOrder(ProductType.TOYS, Channel.ECOMMERCE));
	}

}