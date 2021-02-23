package com.parts.low_level;

import com.parts.high_level.Factory;
import com.parts.high_level.Headlight;
import com.parts.high_level.Tire;

public class MercedesFactory extends Factory {
	
	

	@Override
	public Headlight makeHeadlight() {
		
		//Headlight h = new MercedesHeadlight();
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}
	
	

}
