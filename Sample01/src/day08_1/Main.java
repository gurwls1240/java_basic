package day08_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewsMachine youtuber = new NewsMachine();
		NewsMachine singer = new NewsMachine();
		
		Observer subscriber1 = new AnnualSubscriber();
		Observer subscriber2 = new AnnualSubscriber();
		
		
		youtuber.addOberver(subscriber1);
		youtuber.addOberver(subscriber2);
		
		singer.addOberver(subscriber1);
		
		youtuber.settingNews("새우먹방", "블랙타이거 새우 존맛탱");
		singer.settingNews("신곡 나옴", "제목은 FANCY");
		
		youtuber.notifyObservers();
		singer.notifyObservers();
		
		Observer subscriber3 = new AnnualSubscriber();
		
		subscriber3.subscribe(youtuber);
		youtuber.notifyObservers();
		
	
		
	}

}
