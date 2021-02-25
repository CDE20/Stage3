
public class BuilderPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();

		System.out.println("Veg Meal");

		vegMeal.showItems();

		System.out.println("Total Cost: " + vegMeal.getCost());
		
		Meal nonVegMeal =mealBuilder.prepareNonVegMeal();
		System.out.println("Non vegMeal ");
		nonVegMeal.showItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());

	}

}
