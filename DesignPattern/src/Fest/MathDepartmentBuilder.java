package Fest;

public class MathDepartmentBuilder extends DepartmentBuilder {
	
	

	public Department department;
	public MathDepartmentBuilder(String deptName,Mediator mediator) {
		
		department=new Department(deptName,mediator);
	}

	@Override
	public void setLocation() {
		
		department.setLocation("Shahid Minar Area");
	}

	@Override
	public void setNumberOfStudent() {
		
		department.setNumberOfStudent(180);
		
	}

	@Override
	public void setNumberOfTeacher() {
		
		department.setNumberOfTeacher(40);
	}

	@Override
	public Department build() {
		
		return department;
	}
}
