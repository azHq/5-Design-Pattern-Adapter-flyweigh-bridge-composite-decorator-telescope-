package Fest;

public class CSEDepartmentBuilder extends DepartmentBuilder {
	
	

	public Department department;
	public CSEDepartmentBuilder(String deptName,Mediator mediator) {
		
		department=new Department(deptName,mediator);
	}

	@Override
	public void setLocation() {
		
		department.setLocation("Mokarrom baban");
	}

	@Override
	public void setNumberOfStudent() {
		
		department.setNumberOfStudent(120);
	}

	@Override
	public void setNumberOfTeacher() {
		
		department.setNumberOfTeacher(30);
	}


	@Override
	public Department build() {
		
		return department;
	}

}
