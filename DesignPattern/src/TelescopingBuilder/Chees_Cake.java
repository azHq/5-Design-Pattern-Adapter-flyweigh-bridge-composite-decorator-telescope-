package TelescopingBuilder;

public class Chees_Cake extends Desert{

	private double price;
	private int quantity;
	private String name;
	
	public Chees_Cake(double price, int quantity,String name) {
		
		this.price = price;
		this.quantity = quantity;
		this.name=name;
	}
	
	@Override
	public double getPrice() {
		
		return price;	
	}

	@Override
	public int getQuantity() {
		
		return quantity;
	}


	@Override
	public String getName() {
		
		return name;
	}
	

}

