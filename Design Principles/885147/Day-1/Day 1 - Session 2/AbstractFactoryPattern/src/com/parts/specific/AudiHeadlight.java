package com.parts.specific;

import com.parts.generic.Headlight;

public class AudiHeadlight extends Headlight {

	@Override
	public void produceHeadlight() {
		System.out.println("Audi Headlight produced in Audi factory");

	}

}