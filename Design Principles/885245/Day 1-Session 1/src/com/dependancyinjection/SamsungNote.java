package com.dependancyinjection;

public class SamsungNote implements Iphone
{
	@Override
    public String getPhonePart1()
    {
	  return "Samsung Display";
     }
	@Override
	public double getPart1cost()
	{
		return 500;
	}
}
