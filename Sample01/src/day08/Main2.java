package day08;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] obj = {
			new Fish("쿠피"),
			new Dog("허스키" , "또또")
			
			
			
		};
		
		for (Object data : obj) {
			exec(data);
		}
		
	}
	
	
	public static void exec(Object obj) {
		//obj.print();
		if(obj instanceof Animal) {
			((Animal)obj).print();
		}
		
	}

}
