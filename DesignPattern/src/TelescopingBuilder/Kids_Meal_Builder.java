package TelescopingBuilder;

public class Kids_Meal_Builder implements Meal_Builder {

	public Meal meal; 
	public Kids_Meal_Builder() {
		
		meal=new Meal();
	}
	@Override
	public Meal buildMeal() {
		
		return meal;
	}

	@Override
	public void setManDish() {
		
		meal.setMaindish(new Burger(200.0,2,"Egg Burger") );
	}

	@Override
	public void setDesert() {
		
		meal.setDesert(new Donut(50.0,1,"Donut"));
	}

	@Override
	public void setSoftDrink() {
		
		meal.setSoftdrink(new Pepsi(90.0,1,"pepsi"));
	}

	@Override
	public void setGift() {
		
		meal.setGift(new Car(1,"Sports Car"));
	}

}
