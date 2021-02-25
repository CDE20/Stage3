public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		//Veg Meal
		Meal vegMeal = mealBuilder.prepareVegMeal();
		
		System.out.println("Veg Meal");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		
		//Non-Veg Meal
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());

	}

}