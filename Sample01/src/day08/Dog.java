package day08;

public class Dog extends Animal{

	String kind;
	String name;
	
	public Dog(String kind) {
		super.kind = "강아지과";
	}

	public Dog(String kind , String name) {
		super();
		this.kind = kind;
		this.name = name;
	}
	
	
	public void print () {
		System.out.printf("%s %s %s \n" , super.kind , this.kind , this.name);
	}
	
}