package com.atik.factory;

import com.atik.abstractclass.Factory;
import com.atik.abstractclass.Headlight;
import com.atik.abstractclass.Tire;
import com.atik.audi.AudiHeadlight;
import com.atik.audi.AudiTire;

public class AudiFactory extends Factory {

	@Override
	public Headlight makeHeadlight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
