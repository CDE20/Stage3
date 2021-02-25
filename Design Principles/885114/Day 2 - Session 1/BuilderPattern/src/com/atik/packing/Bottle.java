package com.atik.packing;

import com.atik.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "Bottle";
	}

}
