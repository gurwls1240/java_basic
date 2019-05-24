package day07;

public class SingltonMain {

}


class Singleton{
	
	
	private static Singleton uniqueInstance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
}