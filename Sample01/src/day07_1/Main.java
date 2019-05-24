package day07_1;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Student("홍길동" , 20 , 200201);
		Person p2 = new Teacher("이순신" , 30 , "JAVA");
		Person p3 = new Employee("유관순" , 40 , "교무과");
		
		p1.print();
		p2.print();
		p3.print();
		
		personPrint(p3);
		
		Person[] p = {
				new Student("홍길동" , 20 , 200201),
				new Student("캡아" , 20 , 200201),
				new Student("아이언맨" , 20 , 200201),
				new Teacher("이순신" , 30 , "JAVA"),
				new Teacher("롤선생" , 30 , "C프로그래밍"),
				new Employee("유관순" , 40 , "교무과")
		};
		
		for(Person data : p) {
			personPrint(data);
		}
		
		System.out.println("=======================================");
		
		for(Person data : p) {
			if(data instanceof Student) {
				System.out.println(data.getName());
				System.out.println(((Student)data).getId());
			}
			
		}
		
		
	}
	public static void personPrint(Person e) {
		e.print();
	}
	
	
	
}
