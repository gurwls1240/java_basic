package day09.innner;

import javax.swing.JOptionPane;
import day09.tv.Command;



public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Command delete = () ->{
				System.out.println("Do delete~");
		};
		Command update = new Command() {
			
			@Override
			public void exac() {
				// TODO Auto-generated method stub
				System.out.println("Do update");
			}
		};
		Command list = new Command() {
			
			@Override
			public void exac() {
				// TODO Auto-generated method stub
				System.out.println("Do List");
			}
		};
		Command create = new Command() {
			
			@Override
			public void exac() {
				// TODO Auto-generated method stub
				System.out.println("Do Create");
			}
		};
		
		String msg = JOptionPane.showInputDialog("수행할 명령을 입력해주세요 Create Delete List Update");
		
		
		switch(msg.trim().toLowerCase()) { // trim 메소드 양옆에 있는 공백을 제거해줍니다.
		case "delete":
			delete.exac();
			break;
		case "create":
			create.exac();
			break;
		case "list":
			list.exac();
			break;
		case "update":
			update.exac();
			break;
		default :
			System.out.println("다시 입력 ㄱㄱ");
		}
		
		
		
	}

}
