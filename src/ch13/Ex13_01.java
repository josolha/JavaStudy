package ch13;

public class Ex13_01 {

	public static void main(String[] args) {
		ThreadEX1_1 t1 = new ThreadEX1_1(); // Thread 상속 클래스의 스레드 객체 생성 
		
		
//		Runnable r =new ThreadEx1_2();
		ThreadEx1_2 r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		
		t1.start(); //스레드 실행대기 상태 
		t2.start(); //스레드 실행 대기 상태 
		
	}
}

//thread를 사용하려면 Thread를 상속하거나 Runnable 인터페이스를 구현한 클래스에서만 사용이 가능 .

class ThreadEX1_1 extends Thread{
	// public class Thread extends Object implements Runnable
	// thread 클래스는 이 클래스의 스레드가 처리할 일을 run메서드를 재정의 해줌.
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("tq의 이름 : "+getName());
			//getName()은 조상인 Thread로 부터 상속 받은 메서드로 메서드 이름을 반환 
			
		}
	}
	
}
class ThreadEx1_2 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			//getName()메서드는 Runnable 인터페이스는 없으므로 구현할수가 없어 사용 불가 
			//현재 사용 중인 스레드는 Thread.cureentThread()로 알아냄(static 메서드)
			System.out.println("현재 사용중 thread : "+ Thread.currentThread().getName());

		}
		
	}
}