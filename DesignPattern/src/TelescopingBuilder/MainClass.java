package TelescopingBuilder;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Choose Your Order:\n1.Kids_Meal\n2.Adults_Meal");
		
		int choose=scr.nextInt();
		if(choose==1) {
			
			Meal_Builder mealbuilder=new Kids_Meal_Builder();
			Waiter waiter=new Waiter(mealbuilder);
			waiter.constructMeal();
		}
		else {
			
			Meal_Builder mealbuilder=new Adults_Meal_Builder();
			Waiter waiter=new Waiter(mealbuilder);
			waiter.constructMeal();
			
		}

	}

}
