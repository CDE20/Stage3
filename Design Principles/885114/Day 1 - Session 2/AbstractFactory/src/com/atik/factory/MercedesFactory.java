package com.atik.factory;

import com.atik.abstractclass.Factory;
import com.atik.abstractclass.Headlight;
import com.atik.abstractclass.Tire;
import com.atik.mercedes.MercedesHeadight;
import com.atik.mercedes.MercedesTire;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}
