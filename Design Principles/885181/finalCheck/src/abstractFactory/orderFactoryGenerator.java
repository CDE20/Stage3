package abstractFactory;

public class orderFactoryGenerator {

public static Order getOrder(String channel,String productType) {
		
		if(channel.equalsIgnoreCase("Ecomm"))
			return new EcommFactory().getOrder(channel,productType);
		else if(channel.equalsIgnoreCase("Tele"))
			return new TeleFactory().getOrder(channel,productType);
		
		return null;
}
}