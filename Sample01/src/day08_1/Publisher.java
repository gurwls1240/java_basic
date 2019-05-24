package day08_1;

public interface Publisher {
	public void addOberver(Observer observer);
	public void notifyObservers();
	public void deleteObserver(Observer observer);
}
