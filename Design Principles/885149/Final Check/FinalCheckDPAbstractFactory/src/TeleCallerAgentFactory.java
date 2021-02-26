
public class TeleCallerAgentFactory {
	
	public static Order placeOrder(Products product) {
		//System.out.println("Order is placed on the Ecommerce Website Channel");
		Order o=null;
		switch(product) {
		case Electronic:
			o= new ElectronicOrder(Channel.Tele_Caller_Agent_Application);
			break;
		case Toys:
			o= new ToyOrder(Channel.Tele_Caller_Agent_Application);
			break;
		case Furniture:
			o= new FurnitureOrder(Channel.Tele_Caller_Agent_Application);
			break;
		}
		return o;
	}

}
