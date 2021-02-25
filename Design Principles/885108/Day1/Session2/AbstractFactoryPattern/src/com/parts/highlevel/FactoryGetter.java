package com.parts.highlevel;

import com.parts.lowlevel.AudiFactory;
import com.parts.lowlevel.MercedesFactory;

public class FactoryGetter {
	
	public static Factory getFactory(String fName) {
		if(fName.equals("Mercedes")) {
			Factory f = new MercedesFactory();
			return f;
		}
		else if(fName.equals("Audi")) {
			Factory f = new AudiFactory();
			return f;
		}
		else {
			return null;
		}
	}
}