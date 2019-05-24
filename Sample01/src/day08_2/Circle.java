package day08_2;

public class Circle extends Shape{

	private double radius;
	//private double area;
	
	public Circle(String name , double radius) {
		super(name);
		this.radius = radius;
		
	}
	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		area = radius*radius*(Math.PI);
	}
	

}
