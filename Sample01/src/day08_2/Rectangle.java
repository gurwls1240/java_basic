package day08_2;

public class Rectangle extends Shape{
	private double width;
	private double hight;
	//private double area;
	public Rectangle(String name ,double width,double hight){
		super(name);
		this.width = width;
		this.hight = hight;
	}
	
	@Override
	public void calculationArea() {
		// TODO Auto-generated method stub
		area = width* hight;
	}
	

}
