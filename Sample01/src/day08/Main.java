package day08;

import static java.lang.Math.PI;

import day07.Animal; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.PI);
		System.out.println(PI);
		System.out.println(Math.random());
		
		Fish f = new Fish("쿠피");
		Dog d = new Dog("시베리아 허스키" , "또또");
		
		
		//Animal a = f;
		
		//a.breath();
		//a.print();
		
		exec(f);
		exec(d);
		
		
	}

	public static void exec(Fish f) {
		f.breath();
		f.print();
	}
	
	public static void exec(Dog d) {
		d.breath();
		d.print();
	}
	
	
}
