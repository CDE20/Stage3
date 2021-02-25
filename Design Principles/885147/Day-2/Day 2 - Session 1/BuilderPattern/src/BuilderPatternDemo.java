public class BuilderPatternDemo {
	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("********************* Veg Meal *********************");
		vegMeal.showItems();
		System.out.println("Total Cost: " + vegMeal.getCost());
		System.out.println();

		Meal nonvegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("********************* NonVeg Meal *********************");
		nonvegMeal.showItems();
		System.out.println("Total Cost: " + nonvegMeal.getCost());

	}

}