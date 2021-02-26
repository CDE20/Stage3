
public class AbtractMain {
	
	public static void main(String[] args) {
		System.out.println(OrderFactory.placeOrder(Products.Toys,Channel.E_Commerce_Website));
		System.out.println(OrderFactory.placeOrder(Products.Furniture,Channel.Tele_Caller_Agent_Application));
	}

}
