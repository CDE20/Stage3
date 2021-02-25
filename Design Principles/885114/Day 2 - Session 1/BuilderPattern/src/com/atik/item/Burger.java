package com.atik.item;

import com.atik.interfaces.Item;
import com.atik.interfaces.Packing;
import com.atik.packing.Wrapper;

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}
	
}
