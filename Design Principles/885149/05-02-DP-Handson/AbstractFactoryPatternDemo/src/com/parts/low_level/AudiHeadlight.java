package com.parts.low_level;

import com.parts.high_level.Headlight;
import com.parts.high_level.Tire;

public class AudiHeadlight extends Headlight{

	

	@Override
	public void produceHeadlight() {
		System.out.println("Audi Headlight produced in Audi factory");
		
	}

}
