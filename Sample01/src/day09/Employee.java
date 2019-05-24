package day09;

public class Employee {
	private String name;
	private String dept;
	
	public Employee(String name, String dept) {
		super();
		this.name = name;
		this.dept = dept;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if(obj != null && obj instanceof Employee) {
			Employee temp = (Employee)obj;
			if(name.equals(temp.name) && dept.equals(temp.dept)) {
				flag = true;
			}
		}
		
		return flag;
	}
	
	
}
