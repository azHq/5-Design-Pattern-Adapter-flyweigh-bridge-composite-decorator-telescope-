package FlyWeight;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		
		String[] color= {"red","green","blue","black","white","yellow","cyan","gray","lightblue","lightgreen"};
		Factory factory=new Factory();
		
		//Object gulo reuse na kore
		Random rand=new Random(90);
		Shape shape;
		
		long start=System.currentTimeMillis();
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10000;j++) {
				
				if(j%2==0) {
					shape=new Circle(color[i]);
				}
				else {
					shape=new Rectangle(color[i]);
				}
				
				shape.draw(rand.nextInt(90)+10,rand.nextInt(90)+10);
					
			}
			
		}
		long end=System.currentTimeMillis();
		
		long exeTime=end-start;
		
		
		start=System.currentTimeMillis();
		//Object gulo reuse kore
		for(int i=0;i<10;i++) {
			for(int j=0;j<10000;j++) {
				
				
				shape=factory.getShape(color[i],j);
				shape.draw(rand.nextInt(90)+10,rand.nextInt(90)+10);
				
			}
			
		}
		end=System.currentTimeMillis();
		
		System.out.println("\n\nWithout Fly Weight Pattern....?");
		System.out.println("Total Created Object: "+100000);
		System.out.println("Execution Time: "+exeTime+" Millis");
		
		System.out.println("\n\nWith Fly Weight Pattern....?");
		System.out.println("Total Created Object: "+10);
		System.out.println("Execution Time: "+(end-start)+" Millis");
		System.out.println(((double)exeTime)/(end-start)+" Times Faster");
		
	}

}
