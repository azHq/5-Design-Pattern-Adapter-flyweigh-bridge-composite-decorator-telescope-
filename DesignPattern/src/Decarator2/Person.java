package Decarator2;

public class Person implements Comparable<Person>{
	public String name;
	public double weight;
	public double height;
	public double age;
	public Person(String name, double weight, double height, double age) {
		
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		
		if(this.age>o.age) {
			
			return -1;
		}
		else {
			return 1;
		}
		
	}
	
	

}
