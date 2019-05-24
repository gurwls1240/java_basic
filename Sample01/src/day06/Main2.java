package day06;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("start");
		BlockTest b = new BlockTest();
		BlockTest c = new BlockTest();
		
	}

}
class BlockTest{
	static {
		System.out.println("초기화 static()");
	}
	
	{
		System.out.println("초기화 {}");
	}
	
	public BlockTest() {
		System.out.println("BLocktest() constructor");
	}
}