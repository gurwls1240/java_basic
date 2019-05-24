package day07_1;

public class Student extends Person{
	private int id;

	
	public Student(String name, int age , int id) {
		super(name, age);
		this.id = id;
	}


	public void print() {
		super.print();
		System.out.println("ID : " + id);
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
