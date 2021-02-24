package com.low_level;

import com.high_level.Item;
import com.high_level.Packing;

public abstract class Burger implements Item{
	
	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
	@Override
	public abstract float price() ;
}
