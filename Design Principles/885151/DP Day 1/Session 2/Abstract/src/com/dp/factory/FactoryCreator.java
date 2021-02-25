package com.dp.factory;

import com.dp.Factory;

public class FactoryCreator {

	
	public Factory factory(String factory) {
		if(factory==null || factory.isEmpty())
			return null;
		else if(factory.equalsIgnoreCase("Mercedes"))
			return new MercedesFactory();
		else if(factory.equalsIgnoreCase("Audi"))
			return new AudiFactory();
		
		return null;
	}
}
