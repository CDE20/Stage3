package com.high_level;

import com.low_level.ChickenBurger;
import com.low_level.Coke;
import com.low_level.Pepsi;
import com.low_level.VegBurger;

public class MealBuilder {
	
	public Meal prepareVegMeal() {
		Item item1 = new VegBurger();
		Item item2 = new Pepsi();
		Meal meal = new Meal();
		meal.addItme(item1);
		meal.addItme(item2);
		return meal;
	}
	
	public Meal prepareNogVegMeal() {
		Item item1 = new ChickenBurger();
		Item item2 = new Coke();
		Meal meal = new Meal();
		meal.addItme(item1);
		meal.addItme(item2);
		return meal;
	}
}
