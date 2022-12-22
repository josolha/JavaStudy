package ch07;

import java.awt.Button; // awt는 자바 초기의 GUI용 패키
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex07_18 {

	public static void main(String[] args) {
		
		Button b = new Button("start");
		b.addActionListener(new EventHandler());
		// 원래 addActionListener()메서등의 파라미터는 ActionListener 인터페이스를 
		// 구현한 클래스의 객체를 사용 
		// EventHandler 클래스가 ActionListener인터페이스를 구현한 클래스를 만들어
		// EventHandler를 만들어 사용
	}

}
class EventHandler implements ActionListener {
	//ActionListener 의 인터페이스를 구현할 시에는 추상메서드를 구현
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occured !!");
	}
}
