package com.high_level;

public class BuilderPatternDemo {
	
	
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		
		Meal meal = builder.prepareVegMeal();
		
		meal.showItems();
		System.out.println(meal.getCost());
	}

}
