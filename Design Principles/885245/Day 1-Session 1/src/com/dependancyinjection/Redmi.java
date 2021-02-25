package com.dependancyinjection;

public class Redmi implements Iphone
{
   @Override
   public String getPhonePart1()
   {
	   return "Redmi Display";
   }
   @Override
   public double getPart1cost()
   {
	   return 500;
   }
}
