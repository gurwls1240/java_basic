package day10_1;

import day10.MoneyException;

/**
 * 
 * @author student
 * @since  2019.04.30
 * @version 1.0
 */
public class Account {
    //    계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력
    private String number;
    private int money;
    
    
    public Account(String number,int money) throws MoneyException{
       this.setNumber(number);
       if(money <0) {
    	   throw new MoneyException();
       }
		this.setMoney(money);
       
		
    }
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		
		   this.money = money;
	}
	//입금 
	public void input(int money) {
		if(money>0) {
			this.money += money; 
		}
		return;
	}
	
	//출금
	public  int output(int money) {
		if(this.money >= money) {
			this.money -= money;
			return money;
		}
		System.out.println("잔고 부족!!!");
		return 0;
	}
	//계좌이체
	/**
	 * 
	 * @param from ~~~~~~~
	 * @param to   ~~~~
	 * @param money  이체금액
	 */
	public static void transfer(Account from,Account to,int money) {
		//int t = from.output(money);
		//to.input(t);
		
		to.input(from.output(money));
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", money=" + money + "]";
	}
	//통장정보출력
    public void print() {
    	System.out.printf("Account[통장번호:%20s ,잔고: %d 원 ]%n",number,money);
    }
    
}
