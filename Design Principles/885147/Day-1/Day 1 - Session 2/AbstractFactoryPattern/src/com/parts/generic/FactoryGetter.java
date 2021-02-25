package com.parts.generic;

import com.parts.specific.AudiFactory;
import com.parts.specific.MercedesFactory;

public class FactoryGetter {
	
	public static Factory getFactory(String factoryName) {
		if(factoryName.equalsIgnoreCase("Mercedes")) {
			Factory factory = new MercedesFactory();
			return factory;
		}
		else if(factoryName.equalsIgnoreCase("Audi")) {
			Factory factory = new AudiFactory();
			return factory;
		}
		else {
			return null;
		}
	}
}