package com.parts.lowlevel;

import com.parts.highlevel.Tire;

public class MercedesTire extends Tire  {
	
	@Override
	public void produceTire() {
		System.out.println("Mercedes Tire from Mercedes Factory");
	}

}