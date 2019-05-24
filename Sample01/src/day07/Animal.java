package day07;

public class Animal {
	String kind = "동물의 종류";
	

	public Animal(String kind) {
		super();
		// TODO Auto-generated constructor stub
		this.kind = kind;
	}
	
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}



	public void breath() {
		System.out.println("breath for lungs");
	}
	
}

class Dog extends Animal{

	String kind;
	String name;
	
	public Dog(String kind) {
		super(kind);
		// TODO Auto-generated constructor stub
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