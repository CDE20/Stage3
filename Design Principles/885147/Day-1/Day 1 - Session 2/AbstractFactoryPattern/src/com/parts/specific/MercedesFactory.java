package com.parts.specific;

import com.parts.generic.Factory;
import com.parts.generic.Headlight;
import com.parts.generic.Tire;

public class MercedesFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {

		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}

}