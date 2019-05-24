package day09.tv;

public class TVUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV user1 = new SamsungTV();
		
		//user1.powerON();
		
		TV user2 = new LGTV();
		
		tv(user2);
		tv(user1);
		
		
	}
	public static void tv(TV tv) {
		tv.powerON();
	}
	
	
	
}
