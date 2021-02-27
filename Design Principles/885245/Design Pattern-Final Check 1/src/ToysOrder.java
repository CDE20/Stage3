public class ToysOrder extends Order
{
public ToysOrder(Channel channel)
{
	super(channel,ProductType.TOY);
	processOrder();
}
@Override
void processOrder()
{
	System.out.println("Processing toys order");
}
}
