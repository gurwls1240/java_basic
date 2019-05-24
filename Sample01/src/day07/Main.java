package day07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car avente = new Car("Avente" , "Black");
		avente.printSpec();
		
		Car sonata = new Car();
		Car santafe = new Car(sonata);
		
		sonata.printSpec();
		santafe.printSpec();
		
	}

}


class Car{
	String mCarType;
	String mColor;
	
	public Car(Car c) {
		if(c != null) {
			this.mCarType = c.mCarType;
			this.mColor = c.mColor;
		}
		
	}
	
	
	public Car(String mCarType, String mColor) {
		super();
		this.mCarType = mCarType;
		this.mColor = mColor;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void printSpec() {
		System.out.println("car [" + mCarType + ","+ mColor +"]");
	}
	
	
	
}