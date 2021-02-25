package com.dp.test;

import static org.junit.Assert.*;

import com.dp.Movable;
import com.dp.MovableAdapter;
import com.dp.model.BugattiVeyron;
import com.dp.model.MovableAdapterImpl;

public class Test {

	@org.junit.Test
	public void whenConvertingMPHtoKMPH_thenSuccessfullyConverted() {
		
		Movable buggatiVeyron = new BugattiVeyron();
		MovableAdapter movableAdapter = new MovableAdapterImpl(buggatiVeyron);
		
		assertEquals(movableAdapter.getSpeed(),431.30312,0.000001);
	}
	
	@org.junit.Test
	public void whenConvertingUSDtoEURO_thenSuccessfullyConverted() {
		
		Movable buggatiVeyron = new BugattiVeyron();
		MovableAdapter movableAdapter = new MovableAdapterImpl(buggatiVeyron);
		
		assertEquals(movableAdapter.getPrice(),82144.96,0.000001);
	}
	
	
}
