package TelescopingBuilder;

public class Waiter {
	
	Meal_Builder mealbuilder;
	public Waiter(Meal_Builder mealbuilder) {
		
		this.mealbuilder=mealbuilder;
	}
	
	public void constructMeal() {
		
		mealbuilder.setManDish();
		mealbuilder.setDesert();
		mealbuilder.setSoftDrink();
		mealbuilder.setGift();
		Meal meal=mealbuilder.buildMeal();
		
		System.out.print("Meal Type:");
		if(mealbuilder instanceof Kids_Meal_Builder) {
			System.out.println("Kids_Meal");
			System.out.println("\tMainDish:");
			System.out.println("\t\tName:"+meal.maindish.getName()+"\n\t\tPrice:"+meal.maindish.getPrice()+"\n\t\tQuantity:"+meal.maindish.getQuantity());
			System.out.println("\tDesertFood:");
			System.out.println("\t\tName:"+meal.desert.getName()+"\n\t\tPrice:"+meal.desert.getPrice()+"\n\t\tQuantity:"+meal.desert.getQuantity());
			System.out.println("\tSoftDrink:");
			System.out.println("\t\tName:"+meal.softdrink.getName()+"\n\t\tPrice:"+meal.softdrink.getPrice()+"\n\t\tQuantity:"+meal.softdrink.getQuantity());
			System.out.println("\tGift:");
			System.out.println("\t\tName:"+meal.gift.getName()+"\n\t\tQuantity:"+meal.gift.getQuantity());
			
		}
		else {
			
			System.out.println("Adults_Meal");
			System.out.println("\tMainDish:");
			System.out.println("\t\tName:"+meal.maindish.getName()+"\n\t\tPrice:"+meal.maindish.getPrice()+"\n\t\tQuantity:"+meal.maindish.getQuantity());
			System.out.println("\tDesertFood:");
			System.out.println("\t\tName:"+meal.desert.getName()+"\n\t\tPrice:"+meal.desert.getPrice()+"\n\t\tQuantity:"+meal.desert.getQuantity());
			System.out.println("\tSoftDrink:");
			System.out.println("\t\tName:"+meal.softdrink.getName()+"\n\t\tPrice:"+meal.softdrink.getPrice()+"\n\t\tQuantity:"+meal.softdrink.getQuantity());
			System.out.println("\tGift:");
			System.out.println("\t\tName:"+meal.gift.getName()+"\n\t\tQuantity:"+meal.gift.getQuantity());
		}
		
		System.out.println("Total Package Price:"+meal.getTotalBill()+"TK");
		
		
	}

}
