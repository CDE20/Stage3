package com.parts.specific;

import com.parts.generic.Tire;

public class MercedesTire extends Tire {

	@Override
	public void produceTire() {
		System.out.println("Mercedes Tyre Produced in Mercedes factory");
	}

}