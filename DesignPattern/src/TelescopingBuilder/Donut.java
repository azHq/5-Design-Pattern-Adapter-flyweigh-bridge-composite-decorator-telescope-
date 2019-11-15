package TelescopingBuilder;

public class Donut extends Desert{

	private double price;
	private int quantity;
	private String name;
	
	public Donut(double price, int quantity,String name) {
		
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