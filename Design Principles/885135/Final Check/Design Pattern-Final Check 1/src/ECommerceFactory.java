
public class ECommerceFactory {

	public Order createOrder(ProductType productType) {
		// TODO Auto-generated method stub
		switch(productType){
			case ELECTRONIC:
				return new ElectronicProduct(Channel.ECOMMERCE);
			case FURNITURE:
				return new FurnitureProduct(Channel.ECOMMERCE);
			case TOY:
				return new ToysProduct(Channel.ECOMMERCE);
		}
		return null;
	}
	
}
