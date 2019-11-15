package TelescopingBuilder;

public class Meal {
	
	
	MainDish maindish;
	Desert desert;
	SoftDrink softdrink;
	Gift gift;
	public Meal() {
	
		
	}
	
	public MainDish getMaindish() {
		return maindish;
	}
	public void setMaindish(MainDish maindish) {
		this.maindish = maindish;
	}
	public Desert getDesert() {
		return desert;
	}
	
	public void setDesert(Desert desert) {
		this.desert = desert;
	}
	public SoftDrink getSoftdrink() {
		return softdrink;
	}
	public void setSoftdrink(SoftDrink softdrink) {
		this.softdrink = softdrink;
	}
	public Gift getGift() {
		return gift;
	}
	public void setGift(Gift gift) {
		this.gift = gift;
	}
	
	public double getTotalBill() {
		
		return maindish.getPrice()+desert.getPrice()+softdrink.getPrice();
	}
	
	

}
