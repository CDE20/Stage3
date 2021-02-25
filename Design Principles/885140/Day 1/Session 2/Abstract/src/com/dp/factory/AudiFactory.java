package com.dp.factory;

import com.dp.Factory;
import com.dp.Headlight;
import com.dp.Tire;
import com.dp.model.AudiHeadlight;
import com.dp.model.AudiTire;

public class AudiFactory extends Factory{

	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		return new AudiTire();
	}

}
