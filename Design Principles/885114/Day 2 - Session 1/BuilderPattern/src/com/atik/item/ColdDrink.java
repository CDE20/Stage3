package com.atik.item;

import com.atik.interfaces.Item;
import com.atik.interfaces.Packing;
import com.atik.packing.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();
}
