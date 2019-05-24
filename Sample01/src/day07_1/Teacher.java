package day07_1;

public class Teacher extends Person{
	private String subject;

	
	public Teacher(String name, int age , String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	
	public void print() {
		super.print();
		System.out.println("과목 : " + subject);
	}
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
