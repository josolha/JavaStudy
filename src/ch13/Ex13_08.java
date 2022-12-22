package ch13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex13_08 {

	public static void main(String[] args) {
		Thread08_01 th1 = new Thread08_01();
		Thread08_02 th2 = new Thread08_02();
		
		th1.start();
		th2.start();
		
		try {
			Thread.sleep(2000);
			//th.sleep(2000); th2.sleep(2000)는 의미가 없음
			//sleep는 현재 위치에서 진행중인 스레드 적용 
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("main스레드 종료 ");
	}

}
class Thread08_01 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th1 종료 >>");
				
	}
}

class Thread08_02 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			System.out.print("-");
		}
		System.out.print("<<th2 종료 >>");
			
		
	}
	
}
