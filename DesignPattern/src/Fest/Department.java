package Fest;

public class Department {
	
	public String deptName;
	public String location;
	public int numOfStudent;
	public int numOfTeacher;
	public Mediator mediator;
	public Department(String deptName,Mediator mediator) {
		
		this.deptName=deptName;
		this.mediator=mediator;
	}

	
	public void setLocation(String location) {
		
		this.location=location;
	}

	
	public void setNumberOfStudent(int numOfStudent) {
		
		this.numOfStudent=numOfStudent;
	}

	
	public void setNumberOfTeacher(int numOfTeacher) {
		
		this.numOfTeacher=numOfTeacher;
	}

	
	public void sendMessage(String message) {
		
		mediator.sendMessage(message);
	}

	
	public void recieveMessage(String message) {
		
		System.out.println(deptName+" recieved message: "+deptName+" Invited by "+message);
	}
}
