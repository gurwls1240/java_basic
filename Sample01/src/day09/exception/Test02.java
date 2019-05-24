package day09.exception;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		try {
			throw new Exception("예외발생");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		//System.out.println("en");
		
		
		
		
		
		System.out.println("end");
	}

}
