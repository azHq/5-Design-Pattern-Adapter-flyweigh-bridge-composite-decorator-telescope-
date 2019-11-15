package TelescopingBuilder;

public class Fant extends SoftDrink{

	private double price;
	private int quantity;
	private String name;
	
	public Fant(double price, int quantity,String name) {
		
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
