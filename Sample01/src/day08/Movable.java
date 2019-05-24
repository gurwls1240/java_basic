package day08;

public interface Movable {
	
	public void move();
	
}

interface Drawable {
	void draw();
}


interface MoveAndDrawable extends Movable, Drawable {
	
}
class Circle implements MoveAndDrawable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Circle move ");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle draw ");
	}
	
}

class Rectangle implements MoveAndDrawable{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle draw ");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle move ");
	}
	
}



















