
package Composite;

import java.util.ArrayList;

public class Rectangle extends CompositeShape {

	ArrayList<IShape> shapes=new ArrayList<>();
	@Override
	public void buildShape() {
		
		shapes.add(new Line());
		shapes.add(new Line());
		shapes.add(new Line());
		shapes.add(new Line());
	}
	
	@Override
	public void draw() {
			
		buildShape();
		for(IShape shape:shapes) {
			
			shape.draw();
		}
		
	}
	
	
}
