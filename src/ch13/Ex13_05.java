package ch13;

import javax.swing.JOptionPane;

public class Ex13_05 {

	public static void main(String[] args) {
		//main스레드 시작 
		Runnable t = new Thread5_1();
		Thread th1 = new Thread(t);
		
		th1.start(); //실행대기상태 이고 cpu가 할당되면 run()이 실행 
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요 ");
		System.out.println("입력하신 값은 "+ input + "입니다. ");
	}

}

class Thread5_1 implements Runnable{
	@Override
	public void run() {
		for (int i = 10; i >0 ; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
