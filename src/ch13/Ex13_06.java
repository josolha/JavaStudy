package ch13;

public class Ex13_06 {
	
	//main 스레드 시작됨 
	public static void main(String[] args) {
		
		//main스레드가 다른 스레드를 만듬(main스레드가 부모 스레드)
		//main은 기본 NORM_PRIORITY인 5이다 
		//자식 스레드는 부모의 우선순위를 상속 
		ThreadEx6_1 th1 = new ThreadEx6_1();
		ThreadEx6_2 th2 = new ThreadEx6_2();
		
		//priority 설정은 start() 이전에 가능 
		th2.setPriority(7);
		
		System.out.println("Priority of th1(-) : " + th1.getPriority());
		System.out.println("Priority of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start();
		
	
	}

}

class ThreadEx6_1 extends Thread{
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");	
			for (int j = 0; j < 10000000; j++) {
				
			}
			
		}
		System.out.println("th1종료");
		
	}
}

class ThreadEx6_2 extends Thread {
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("|");	
			for (int j = 0; j < 10000000; j++) {
				
			}
			
		}
		System.out.println("th2종료");
	}
}