package day06;

import java.util.Random;

public class Account {
   // 계좌번호 잔고 입금 출금 계좌이체 통장정보출력

   String mAccountNumber;
   int mBalance;
   String mName;
   Bank bank;
   static int makeCount = 0;
   public int makedNo;
   {
	   ++makeCount;
	   makedNo = makeCount;
   }

   public void enterBankSys(Bank a) {
      a.mAccountList.add(this);
   }

   static String AccountNumGenerator() {
      Random rand = new Random();
      String generatedAccountNum = "";

      for (int i = 0; i < 6; i++) {
         String ran = Integer.toString(rand.nextInt(10));
         generatedAccountNum += ran;
      }

      return generatedAccountNum;
   }

  

   Account(Bank bank, String mName, int mBalance, String accountNum) {
      this.bank = bank;
      this.mName = mName;
      this.mBalance = mBalance;
      this.mAccountNumber = accountNum;
      this.enterBankSys(this.bank);
   }

   Account(String mName, int mBalance) {
      this.mName = mName;
      this.mBalance = mBalance;
      mAccountNumber = AccountNumGenerator();
      enterBankSys(this.bank);
   }

   public static void transfer(Account accFrom, Account accTo, int money) {
	   System.out.println("==============계좌이체=============");
	      System.out.println("보내는 돈 : " + money);
	      System.out.println("보내는 사람 : " + accFrom.getmName() + "잔고 : " + accFrom.getmBalance());
	      System.out.println("받는 사람 : " + accTo.getmName() + "잔고 : " + accTo.getmBalance());
      accTo.deposit(accFrom.withdraw(money));
      
      System.out.println("결과 : " + "보내는 사람 잔고 : " + accFrom.getmBalance() + "받는 사람 잔고 : " +accTo.getmBalance());
   }

   public void transfer(int money, Account acc) {
      if (mBalance > money) {
         mBalance -= money;
         acc.deposit(money);
      }

   }

   public void transfer(String accountNum, int money) {
      transfer(this, this.bank.searchAccount(accountNum), money);
   }

   public void printAccountInfo() {
      System.out.println("==============계좌정보 입니다.============");
      System.out.println("예금주 명 : " + mName);
      System.out.println("계좌번호: " + mAccountNumber);
      System.out.println("잔고 : " + mBalance);
   }

   public void deposit(int money) {
      if (money > 0) {
         mBalance += money;
      }

   }

   public int withdraw(int money) {
      if (mBalance > money) {
         mBalance -= money;
         return money;
      }
      System.out.println("잔고 부족입니다.");
      return 0;
   }

   public String getmAccountNumber() {
      return mAccountNumber;
   }

   public void setmAccountNumber(String mAccountNumber) {
      this.mAccountNumber = mAccountNumber;
   }

   public int getmBalance() {
      return mBalance;
   }

   public void setmBalance(int mBalance) {
      this.mBalance = mBalance;
   }

   public String getmName() {
      return mName;
   }

   public void setmName(String mName) {
      this.mName = mName;
   }
}