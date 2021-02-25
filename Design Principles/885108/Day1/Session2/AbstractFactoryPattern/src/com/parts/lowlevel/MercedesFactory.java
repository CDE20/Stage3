package com.parts.lowlevel;

import com.parts.highlevel.Factory;
import com.parts.highlevel.HeadLight;
import com.parts.highlevel.Tire;

public class MercedesFactory extends Factory {
	
	

	@Override
	public HeadLight makeHeadLight() {
		
		//Headlight h = new MercedesHeadlight();
		return new MercedesHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new MercedesTire();
	}
	
	

}