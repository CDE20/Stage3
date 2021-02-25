package com.parts.lowlevel;

import com.parts.highlevel.HeadLight;

public class MercedesHeadlight extends HeadLight{
	
	@Override
	public void produceHeadLight() {
		System.out.println("Mercedes Headlight produced using Mercedes Factory");
	}

}