
public class ECommerceFactory {
	
	
	public static Order placeOrder(Products product) {
		//System.out.println("Order is placed on the Ecommerce Website Channel");
		Order o=null;
		switch(product) {
		case Electronic:
			o= new ElectronicOrder(Channel.E_Commerce_Website);
			break;
		case Toys:
			o= new ToyOrder(Channel.E_Commerce_Website);
			break;
		case Furniture:
			o= new FurnitureOrder(Channel.E_Commerce_Website);
			break;
		}
		return o;
	}

}
