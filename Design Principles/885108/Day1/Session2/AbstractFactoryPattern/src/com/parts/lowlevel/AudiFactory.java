  
package com.parts.lowlevel;

import com.parts.highlevel.Factory;
import com.parts.highlevel.HeadLight;
import com.parts.highlevel.Tire;

public class AudiFactory extends Factory{

	@Override
	public HeadLight makeHeadLight() {
		// TODO Auto-generated method stub
		return new AudiHeadlight();
	}

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}