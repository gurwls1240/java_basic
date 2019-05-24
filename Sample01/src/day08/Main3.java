package day08;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		
		Rectangle r = new Rectangle();
		
		c.draw();
		r.move();
		
		Drawable d = c;
		Movable m = r;
		
		MoveAndDrawable[] md = {c,r};
		
		md[0].draw();
		md[1].move();
		
	}

}
