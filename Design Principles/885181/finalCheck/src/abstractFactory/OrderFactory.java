package abstractFactory;

public abstract class OrderFactory {
   public abstract Order getOrder(String channel,String productType);
}
