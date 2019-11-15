package TelescopingBuilder;

public class Car extends Gift{

	private int quantity;
	private String name;
	
	public Car(int quantity,String name) {
		
		this.quantity = quantity;
		this.name=name;
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

