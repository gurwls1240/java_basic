package day07_1;

public class Person {
	protected String name;
	protected int age;
	
	
	protected void print () {
		System.out.println("이름 : " + name + "나이 : " + age);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
