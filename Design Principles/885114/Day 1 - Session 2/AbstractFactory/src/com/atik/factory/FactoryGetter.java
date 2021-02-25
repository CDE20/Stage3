package com.atik.factory;

import com.atik.abstractclass.Factory;

public class FactoryGetter {

	public static Factory getFactory(Class type) {
		if (type.equals(MercedesFactory.class)) {
			return new MercedesFactory();
		} else if (type.equals(AudiFactory.class)) {
			return new AudiFactory();
		}

		return null;
	}

}
