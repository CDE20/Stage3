package com.parts.high_level;

import com.parts.low_level.AudiFactory;
import com.parts.low_level.MercedesFactory;

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
