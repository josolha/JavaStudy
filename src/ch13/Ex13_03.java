package ch13;

import java.util.Iterator;

public class Ex13_03 {
	static long startTime = 0;

	public static void main(String[] args) {
		//main스레드 동작 
		Thread3_1 th1 = new Thread3_1();
		Runnable r = new Thread3_2();
		Thread th2 = new Thread(r);
		
		//또 한개의 스레드 start 
		th1.start(); //스레드 th1이 처리 (run으로 처리)
		//Runnable 스레드 객체 th2를 만듬
		th2.start();
		
		
		
		//main 스레드 처리 
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 300; i++) {
			String str = new String("-");
			System.out.print(str);
		}
		System.out.println("소요시간1 : "+ + (System.currentTimeMillis()- startTime));
	}

}
class Thread3_1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			String str = new String("|");
			System.out.print(str);
		}
		System.out.println("time2 : "+ (System.currentTimeMillis()- Ex13_03.startTime));
	}
}

//Runnable
class Thread3_2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 300; i++) {
			String str = new String("*");
			System.out.print(str);
		}
		System.out.println("time3 : "+ (System.currentTimeMillis()- Ex13_03.startTime));
	}
}