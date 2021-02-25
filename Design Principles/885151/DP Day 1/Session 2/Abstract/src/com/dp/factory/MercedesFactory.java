package com.dp.factory;

import com.dp.Factory;
import com.dp.Headlight;
import com.dp.Tire;
import com.dp.model.MercedesHeadlight;
import com.dp.model.MercedesTire;

public class MercedesFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

	
}
