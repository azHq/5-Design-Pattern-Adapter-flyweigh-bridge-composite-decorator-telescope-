package FlyWeight;

public class Rectangle extends Shape{
	
	String color;
	public Rectangle(String color) {
		
		this.color=color;
	}

	@Override
	public void draw(int x, int y) {
		
		System.out.println("draw Rectangle in ("+x+","+y+") position");
	}

}
