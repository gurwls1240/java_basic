package day08_1;

import java.util.ArrayList;

public class NewsMachine implements Publisher{

	private String title;
	private String news;
	//private Observer observer;
	private ArrayList<Observer> observers;
	
	public NewsMachine() {
		observers = new ArrayList<>();
	}
	
	public void settingNews(String title , String news) {
		this.title = title;
		this.news = news;
	}
	
	@Override
	public void addOberver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update(title, news);
		}
	}

	@Override
	public void deleteObserver(Observer observer) {
		// TODO Auto-generated method stub
		/*int index = observers.indexOf(observer);
		observers.remove(index);*/
		observers.remove(observer);
		
	}
	
	public String getTitle() {
		return title;
	}
	public String getNews() {
		return news;
	}
}
