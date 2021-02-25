package com.dp.main;

import com.dp.builder.Meal;
import com.dp.builder.MealBuilder;

public class Main {

	public static void main(String[] args) {

		
		MealBuilder mb = new MealBuilder();
		Meal VegMeal = mb.prepareVegMeal();
		VegMeal.showItems();
		
		Meal NonVeg = mb.prepareNonVegMeal();
		NonVeg.showItems();
	}

}
