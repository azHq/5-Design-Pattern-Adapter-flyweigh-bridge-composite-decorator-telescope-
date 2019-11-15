package Fest;

import java.util.ArrayList;

public class Mediator{
	
	ArrayList<Department> deptList=new ArrayList<Department>();
	
	public Mediator() {
		
	}
	
	public void addDepartment(Department dept) {
		
		deptList.add(dept);
	}
	
	public void sendMessage(String message) {
		
		for(Department dept:deptList) {
			
			dept.recieveMessage(message);
		}
	}

}
