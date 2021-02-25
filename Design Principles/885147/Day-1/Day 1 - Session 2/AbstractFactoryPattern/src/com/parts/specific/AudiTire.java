package com.parts.specific;

import com.parts.generic.Tire;

public class AudiTire extends Tire {

	@Override
	public void produceTire() {
		System.out.println("Audi tire produced in Audi factory");
	}

}