package day06;

public class Book {
	private String mTitle;
	private int mPrice;
	
	public Book(String title , int price){
		mTitle = title;
		mPrice = price;
	}
	Book()
	{
		
	}
	
	public void printBookInfo() {
		System.out.println("Title : "+mTitle);
		System.out.println("Price : "+mPrice);
	}
	
	public int getPrice() {
		return mPrice;
	}
	public void setPrice(int price) {
		if(price>0) {
			mPrice = price;
		}
		
	}
	public String getTitle() {
		return mTitle;
	}
	public void setTitle(String title) {
		if(title != null && title.length()>0) {
			mTitle = title;
		}
		
	}
	
	
}

