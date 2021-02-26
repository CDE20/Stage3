
public class OrderFactory {
	
	public static Order placeOrder(Products product,Channel channel) {
		Order o=null;
		switch(channel) {
		case E_Commerce_Website:
			o= ECommerceFactory.placeOrder(product);
			break;
		case Tele_Caller_Agent_Application:
			o= TeleCallerAgentFactory.placeOrder(product);
			break;
		}
		return o;
	}

}
