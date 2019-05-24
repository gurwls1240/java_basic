package day06;

public class Prob6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Java Program" , 7500);
		Book b2 = new Book("JSP Program" , 9500);
		Book b3 = new Book("SQL Fundamentals" , 7000);
		Book b4 = new Book("JDBC Program" , 12500);
		Book b5 = new Book("EJB Program" , 8000);
		
		BookMgr bm = new BookMgr();
		
		bm.addBook(b1);
		bm.addBook(b2);
		bm.addBook(b3);
		bm.addBook(b4);
		bm.addBook(b5);
		
		bm.printBookList();
		System.out.println(bm.printTotalPrice());
		

		
		
	}

}
