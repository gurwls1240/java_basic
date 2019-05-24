package day06;

import java.util.ArrayList;

public class BookMgr {
	ArrayList<Book> mBookList = new ArrayList<>();
	
	private Book[] bookList;
	private int count =0;
	
	public BookMgr()
	{
		bookList = new Book[4];
	}
	
	public void addBook(Book book) {
		if(count == bookList.length) {
			Book[] temp = new Book[bookList.length*2];
			System.arraycopy(bookList, 0, temp, 0, bookList.length);
			bookList = temp;
		}
		bookList[count] = book;
		count++;
	}
	
	
	public int printTotalPrice() {
		int sum =0;
		for(int a=0 ; a<count ; a++) {
			sum += bookList[a].getPrice();
	    	}
		return sum;
	}
	
	public void printBookList() {
		System.out.println("=================책 목록===============");
		for(int a=0 ; a<count ; a++) {
			
			
			
			System.out.println(bookList[a].getTitle());
			}
	}
	/*
	public void addBook(Book book) {
		mBookList.add(book);
		
	}
	
	public void printBookList() {
		System.out.println("=================책 목록===============");
		for(Book b : mBookList) {
			System.out.println(b.getTitle());
			}
	}
	
	public int printTotalPrice() {
		int sum=0;
		for(Book b : mBookList) {
			sum += b.getPrice();
	    	}
		return sum;
	}*/
}
