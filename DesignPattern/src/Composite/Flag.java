package Composite;

import java.util.ArrayList;

public class Flag extends CompositeShape {

		
		@Override
		public void buildShape() {
			
			shapes.add(new Rectangle());
			shapes.add(new Circle());
		}
		
		
}
