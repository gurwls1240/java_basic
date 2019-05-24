package day08_2;

public abstract class Shape {
	protected double area;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public Shape() {
		
	}
	public Shape(String name) {
		this.name = name;
	}
	
	public abstract void calculationArea();
	
	public void print() {
		System.out.println(getName() + "의 넓이는  : " + area);
	}
}
