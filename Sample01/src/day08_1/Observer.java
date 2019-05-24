package day08_1;

public interface Observer {
	
	public void update(String title , String news);
	public void subscribe(Publisher publisher);
	public void printSubsList();
	
}
