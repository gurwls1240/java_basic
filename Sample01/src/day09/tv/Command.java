package day09.tv;

public interface Command {

	void exac();
	default public void process() {
		System.out.println("process");
	}
}

class DeleteCommand implements Command{

	@Override
	public void exac() {
		// TODO Auto-generated method stub
		System.out.println("DeleteCommand");
	}
	
}
class UpdateCommand implements Command{

	@Override
	public void exac() {
		// TODO Auto-generated method stub
		System.out.println("UpdateCommand");
	}
	
}
class ListCommand implements Command{

	@Override
	public void exac() {
		// TODO Auto-generated method stub
		System.out.println("ListCommand");
	}
	
}
class CreateCommand implements Command{

	@Override
	public void exac() {
		// TODO Auto-generated method stub
		System.out.println("CreateCommand");
	}
	
}