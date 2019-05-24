package day07;

public class MainDog {
	public static void main(String[] args) {
		Dog d = new Dog("시베리안 허스키" , "또또");
		d.print();
		
		Object a = new Dog("시베리안 허스키" , "또또");
		
		System.out.println(((Animal)a).kind);
		System.out.println(((Dog)a).kind);
		
		
		if(a instanceof String) {
			System.out.println(((String)a).toString());
		}
		
		Fish f = new Fish("광어");
		
		f.print();
		
		f.breath();
		
		
		
		
		
	}
}
