package day09;

public class Main {

	public static void main(String args[]) {
		Object msg1 = "hello java";
		String msg2 = "hello Python";
		String msg3 = "hello java";
		
		System.out.println(msg1.toString());
		System.out.println(msg2);
		
		
		Employee emp1 = new Employee("홍길동","인사팀");
		Employee emp2 = new Employee("홍길순","영업팀");
		
		System.out.println(emp2.toString());
		System.out.println(emp1);
		System.out.println(emp1.getClass());
		
		System.out.println(msg1.equals(msg2));
		System.out.println(msg1.equals(msg3));
		
		System.out.println(msg1.equals(msg3));
		
		System.out.println(emp1.equals(emp2));
		
		
		
		
		
		
	}
}
