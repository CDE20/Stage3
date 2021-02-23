package com.parts.low_level;

import com.parts.high_level.Factory;
import com.parts.high_level.Headlight;
import com.parts.high_level.Tire;

public class AudiFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
