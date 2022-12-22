package ch07;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07_19 {

	public static void main(String[] args) {
		Frame frame = new Frame("Title");
		frame.setSize(500,300);
		frame.setVisible(true);
		
		Button b = new Button("Start");
		
		frame.add(b);
		
		System.exit(1);
		
		// 익명의 클래스를 이용하는 방법 -- 필요한 위치에 익명의 객체를 만들어줌
		// 클래스는 조상 클래스의 생성자, 인터페이스는 인테페이스 생성자 형식 
		// {  } 안에 구형 ( 특히 인터페이스 일시는 추상 메서드를 구형)
		
		b.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명의 클래스로 만듬");
			}
		});
	}

}
