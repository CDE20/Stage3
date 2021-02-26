package dpdemo.finalAbstract;

public class ecomOrderFactory {

	public Order buildOrder(ProductType productType) {
		// TODO Auto-generated method stub
		switch(productType){
		case ELECTRONICPRODUCTS:
			return new ElectronicOrder(Channel.ECOMMERCE);
		case TOYS:
			return new ToysOrder(Channel.ECOMMERCE);
		case FURNITURE:
			return new FurnitureOrder(Channel.ECOMMERCE);
		}
		return null;
	}

}
