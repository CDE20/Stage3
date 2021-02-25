package com.dp.builder;

import com.dp.model.ChickenBurger;
import com.dp.model.Coke;
import com.dp.model.Pepsi;
import com.dp.model.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
