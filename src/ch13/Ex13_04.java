package ch13;

import javax.swing.JOptionPane; // 자바 GUI용 패키지인 javax.swing에 있는 JOptionPane는 대화창 

public class Ex13_04 {

	public static void main(String[] args) {
		//main 스레드 하나만 이용 
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 .");
		//입력한 결과를 반환 
		System.out.println("입력하신 값은 "+ input + "입니다. ");
		
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초간 시간을 지연한다.
				
			}catch(Exception e) {
				 System.out.println(e.getMessage());
				
			}
			
		}
	}

}
