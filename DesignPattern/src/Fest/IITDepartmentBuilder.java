package Fest;

public class IITDepartmentBuilder extends DepartmentBuilder {
	
	public Department department;
	public IITDepartmentBuilder(String deptName,Mediator mediator) {
		
		department=new Department(deptName,mediator);
	}
	@Override
	public void setLocation() {
		
		department.setLocation("Mokkarron baban");
	}

	@Override
	public void setNumberOfStudent() {
		
		department.setNumberOfStudent(40);
	}

	@Override
	public void setNumberOfTeacher() {
		
		department.setNumberOfStudent(20);
	}

	@Override
	public Department build() {
		
		return department;
	}
}
