package com.dp.main;

import com.dp.Factory;
import com.dp.factory.FactoryCreator;

public class Main {

	public static void main(String[] args) {
		
		FactoryCreator fc = new FactoryCreator();
		
		Factory factory = fc.factory("Mercedes");
		factory.makeHeadlight();
		factory.makeTire();
		
		Factory factory1 = fc.factory("Audi");
		factory1.makeHeadlight();
		factory1.makeTire();
	}

}
