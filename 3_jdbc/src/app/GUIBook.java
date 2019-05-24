package app;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import dao.BookDAO;
import service.BookService;
import service.BookServiceImpl;
import vo.BookVO;

public class GUIBook {

	Frame f = null;
	
	TextArea textArea = null;
	TextField tutle,price,author;
	Button list,insert;
	
	public GUIBook() {
		
		BookDAO dao = new BookDAO();
		BookService service = new BookServiceImpl(dao);
		
		f = new Frame("BOOK App");
		textArea = new TextArea(20, 20);
		f.add(textArea,BorderLayout.NORTH);
		
		list = new Button("LIST");
		insert = new Button("INSERT");
		
		Panel p = new Panel();
		p.add(list);
		p.add(insert);
		
		f.add(p,BorderLayout.SOUTH);
		
		f.setSize(400,400);
		f.setVisible(true);
		
		
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				List<BookVO> data = service.bookList();
				for(BookVO b:data) {
					textArea.append(b.toString()+"\n");
				}
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUIBook();
	}

}
