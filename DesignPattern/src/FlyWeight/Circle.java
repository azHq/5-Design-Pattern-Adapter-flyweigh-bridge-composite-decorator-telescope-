package FlyWeight;

public class Circle extends Shape{

	String color;
	public Circle(String color) {
		
		this.color=color;
	}

	@Override
	public void draw(int x, int y) {
		
		System.out.println("Draw Circle in ("+x+","+y+") position");
	}
}
