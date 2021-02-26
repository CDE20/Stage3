package dpdemo.finalAbstract;

public class teleOrderFactory {

	public Order buildOrder(ProductType productType) {
		// TODO Auto-generated method stub
		switch(productType){
		case ELECTRONICPRODUCTS:
			return new ElectronicOrder(Channel.TELECALLER);
		case TOYS:
			return new ToysOrder(Channel.TELECALLER);
		case FURNITURE:
			return new FurnitureOrder(Channel.TELECALLER);
		}
		return null;
	}

}
