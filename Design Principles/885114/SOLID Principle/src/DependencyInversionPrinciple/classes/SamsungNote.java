package DependencyInversionPrinciple.classes;

import DependencyInversionPrinciple.interfaces.Iphone;

public class SamsungNote implements Iphone {

	@Override
	public String getPhonePart1() {
		return "Display";
	}

	@Override
	public double getPart1Cost() {
		return 500;
	}

}
