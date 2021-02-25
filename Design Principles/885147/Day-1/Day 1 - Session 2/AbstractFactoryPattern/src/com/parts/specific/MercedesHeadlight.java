package com.parts.specific;

import com.parts.generic.Headlight;

public class MercedesHeadlight extends Headlight {

	@Override
	public void produceHeadlight() {
		System.out.println("Mercedes Headlight produced in Mercedes factory");
	}

}