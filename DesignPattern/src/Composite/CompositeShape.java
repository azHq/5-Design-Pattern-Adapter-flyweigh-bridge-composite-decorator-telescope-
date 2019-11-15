package Composite;

import java.util.ArrayList;

public abstract class CompositeShape implements IShape{

	ArrayList<IShape> shapes=new ArrayList<>();
	@Override
	public void draw() {
			
		buildShape();
		for(IShape shape:shapes) {
			
			shape.draw();
		}
	}
	
	public abstract void buildShape();

}
