package day07_1;

public class Employee extends Person{
	private String dept;

	
	
	
	public Employee(String name, int age , String dept) {
		super(name, age);
		this.dept = dept;
	}


	public void print() {
		super.print();
		System.out.println("부서 : " + dept);
	}
	
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
