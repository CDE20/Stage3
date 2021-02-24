package com.parts.low_level;

import com.parts.high_level.Tire;

public class AudiTire extends Tire{

	@Override
	public void produceTire() {
		System.out.println("Audi tire produced in Audi factory");
	}

}
