package Decarator2;

import java.util.ArrayList;
import java.util.Collections;

public class Decorator {
	ArrayList<Person> personList;
	int factor;
	public Decorator(ArrayList<Person> personList,int factor) {
		
		this.personList=personList;
		this.factor=factor;
	}
	
	public void sort() {
		
		Collections.sort(personList);
		
	}

}
