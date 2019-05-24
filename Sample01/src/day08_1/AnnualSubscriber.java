package day08_1;

import java.util.ArrayList;

public class AnnualSubscriber implements Observer{

	private String newsString;
	//private Publisher publisher;
	private ArrayList<Publisher> publishers;
	
	
	public AnnualSubscriber() {
		publishers = new ArrayList<>();
	}
	public void subscribe(Publisher p) {
		publishers.add(p);
		p.addOberver(this);
	}
	
	
	
	@Override
	public void update(String title, String news) {
		// TODO Auto-generated method stub
		newsString = title + " \n" + news;
		display();
	}
	private void display() {
		System.out.println(newsString);
	}
	@Override
	public void printSubsList() {
		// TODO Auto-generated method stub
		System.out.println("--print Subscribe list--");
		
		
		for(Publisher p : publishers) {
			System.out.println(p.getClass());
		}
	}
	
}
