package abstractFactory;

public class EcommFactory extends OrderFactory {

	@Override
	public Order getOrder(String channel, String productType) {
		// TODO Auto-generated method stub
		if(productType.equalsIgnoreCase("electronic"))
		{
			return new ElectronicOrder();
		}
		else if(productType.equalsIgnoreCase("furniture"))
				{
					return new FurnitureOrder();
				}
		else if(productType.equalsIgnoreCase("toy"))
		{
			return new ToyOrder();
		}
				
		return null;
	}

}
