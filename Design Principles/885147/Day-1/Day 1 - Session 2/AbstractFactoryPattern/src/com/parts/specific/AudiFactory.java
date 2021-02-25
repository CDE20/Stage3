package com.parts.specific;

import com.parts.generic.Factory;
import com.parts.generic.Headlight;
import com.parts.generic.Tire;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}

}