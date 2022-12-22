package ch13;

import javax.swing.JOptionPane;

public class Ex13_09 {

	public static void main(String[] args) {
		
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요. ");
		
		System.out.println("입력하신 값은 " + input + "입니다.");
		
		th1.interrupt(); // th1의 interrupt 상태가 true
		//interrupt()는 스레드를 중단을 시키지는 못하고 인터럽트 상태를 이용하여 run 메서드 종료
		
		System.out.println("isInterrupted(): " + th1.isInterrupted());
		
		
		
	}

}
class ThreadEx9_1 extends Thread{
	@Override
	public void run() {
		
		int i =10;
		
		while(i != 10 && !isInterrupted()) {
			System.out.println(i--);
			for(long x =0 ; x<2500000000L; x++) {
				;
			}
		}
		System.out.println("카운트가 종료되었습니다. ");
	}
}
