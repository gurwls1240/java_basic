package day09.exception;

public class test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		
		for(int i =0 ; i< 10 ; i++) {
			System.out.println("-------------------------");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("end");
		
		
	}

}
