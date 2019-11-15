package FlyWeight;

public class Triangle extends Shape{

	String color;
	public Triangle(String color) {
		
		this.color=color;
	}
	@Override
	public void draw(int x, int y) {
		
		System.out.println("draw Triangle in ("+x+","+y+") position");
	}
}
