package com.low_level;

import com.high_level.Item;
import com.high_level.Packing;

public abstract class ColdDrink implements Item{

	@Override
	public Packing packing() {
		return new Bottle();
	}
	
	@Override
	public abstract float price() ;
}
