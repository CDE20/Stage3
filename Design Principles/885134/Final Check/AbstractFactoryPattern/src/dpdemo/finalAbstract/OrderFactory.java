package dpdemo.finalAbstract;


public class OrderFactory {
	
	public static Order buildOrder(ProductType productType, Channel channel)
	{
		switch (channel) {
		case ECOMMERCE:
			return new ecomOrderFactory().buildOrder(productType);
		case TELECALLER:
			return new teleOrderFactory().buildOrder(productType);
	}
	return null;
	}
}
