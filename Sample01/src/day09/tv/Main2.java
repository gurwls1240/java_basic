package day09.tv;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class Main2 {
	public static void main(String args[]) {
		Command cmd = null;
		
		String msg = JOptionPane.showInputDialog("수행할 명령을 입력해주세요 Create Delete List Update");
		
		
		switch(msg.trim().toLowerCase()) { // trim 메소드 양옆에 있는 공백을 제거해줍니다.
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "create":
			cmd = new CreateCommand();
			break;
		case "list":
			cmd = new ListCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;
		default :
			System.out.println("다시 입력 ㄱㄱ");
		}
		
		if(cmd != null) {
			cmd.exac();
			cmd.process();
		}
			
		Calendar c = Calendar.getInstance();
		
	}
}
