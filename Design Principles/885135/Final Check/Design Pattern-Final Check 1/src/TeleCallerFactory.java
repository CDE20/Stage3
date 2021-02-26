
public class TeleCallerFactory {

	public Order createOrder(ProductType productType) {
		// TODO Auto-generated method stub
		switch(productType){
		case ELECTRONIC:
			return new ElectronicProduct(Channel.TELECALLER);
		case FURNITURE:
			return new FurnitureProduct(Channel.TELECALLER);
		case TOY:
			return new ToysProduct(Channel.TELECALLER);
	}
		return null;
	}

}
