package TelescopingBuilder;

public class Adults_Meal_Builder implements Meal_Builder {

	public Meal meal; 
	public Adults_Meal_Builder() {
		
		meal=new Meal();
	}
	@Override
	public Meal buildMeal() {
		
		return meal;
	}

	@Override
	public void setManDish() {
		
		meal.setMaindish(new Pizza(250.0,2,"Spicy Pizza") );
	}

	@Override
	public void setDesert() {
		
		meal.setDesert(new Chees_Cake(50.0,1,"chees cake"));
	}

	@Override
	public void setSoftDrink() {
		
		meal.setSoftdrink(new Fant(100.0,1,"Cold fant"));
	}

	@Override
	public void setGift() {
		
		meal.setGift(new KeyRing(2,"Key Ring"));
	}


}
