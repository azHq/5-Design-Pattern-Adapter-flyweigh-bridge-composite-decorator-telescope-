package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	public Map<String,Shape> map=new HashMap<String,Shape>();
	
	public Factory() {
		
	}
	
	public Shape getShape(String color,int type) {
		
		Shape shape=map.get(color);
		if(shape==null) {
			
			if(type%2==0) shape=new Circle(color);
			else  shape=new Rectangle(color);
			
			map.put(color,shape);
			return shape;
		}
		
		return shape;
	}
	

}
