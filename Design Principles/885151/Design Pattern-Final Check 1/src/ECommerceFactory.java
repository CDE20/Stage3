public class ECommerceFactory 
 {
	public Order createOrder(ProductType productType)
	{
		// TODO Auto-generated method stub
		switch(productType){
			case ELECTRONIC:
				return new ElectronicOrder(Channel.ECOMMERCE);
			case FURNITURE:
				return new FurnitureOrder(Channel.ECOMMERCE);
			case TOY:
				return new ToysOrder(Channel.ECOMMERCE);
		}
		return null;
	}	
}
