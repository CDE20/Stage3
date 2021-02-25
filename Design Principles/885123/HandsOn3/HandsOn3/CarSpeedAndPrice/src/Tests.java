import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

	@Test
	public void testSpeed()
	{
		Movable bugattiVeyron=new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter=new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
		
	}
	
	@Test
	public void testPrice()
	{
		Movable bugattiVeyron=new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter=new MovableAdapterImpl(bugattiVeyron);
		assertEquals(bugattiVeyronAdapter.getPrice(),1748000 , 0.00001);
		
	}
}
