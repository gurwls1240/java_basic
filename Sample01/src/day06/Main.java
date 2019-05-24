package day06;

public class Main {
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Bank bank = new Bank();
      Account a1 = new Account(bank, "Iron Man", 100, "123123");
      Account a2 = new Account(bank, "Captin America", 30, "321321");
      
      a1.printAccountInfo();
      a2.printAccountInfo();
   
     

      // ==================이거를 되게 하면 됨//======================
      
      a1.transfer("321321", 20); 
      a1.printAccountInfo();
      a2.printAccountInfo();
      
      bank.printAccList();
      
      
      //System.out.println(new Main().max(1, 2));
   }
   
   
   public int max(int a, int b) {
	   return a>b ? a:b;
   }

}