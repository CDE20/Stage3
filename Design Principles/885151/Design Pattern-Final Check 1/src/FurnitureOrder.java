public class FurnitureOrder extends Order
{
  public FurnitureOrder(Channel channel)
  {
	  super(channel,ProductType.FURNITURE);
	  processOrder();
  }
  
  @Override
  void processOrder()
  {
	  System.out.println("Processing furniture product order");
  }
}
