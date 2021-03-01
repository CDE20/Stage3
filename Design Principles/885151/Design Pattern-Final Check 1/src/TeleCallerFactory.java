public class TeleCallerFactory {

	public Order createOrder(ProductType productType) {
		// TODO Auto-generated method stub
		switch(productType){
		case ELECTRONIC:
			return new ElectronicOrder(Channel.TELECALLER);
		case FURNITURE:
			return new FurnitureOrder(Channel.TELECALLER);
		case TOY:
			return new ToysOrder(Channel.TELECALLER);
	}
		return null;
	}

}