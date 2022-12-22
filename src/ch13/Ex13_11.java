package ch13;

public class Ex13_11 {
	
	static long startTime = 0;
	

	public static void main(String[] args) {
		
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_1 th2 = new ThreadEx11_1();
		
		th1.start();
		th2.start();
		
		// main스레드 진행
		startTime = System.currentTimeMillis(); // 현재를 밀리세컨드로 표시 (posix타임)
		try {
			
			th1.join(); // main스레드는 여기서 스레드 실행 중단하고 대기, th1이 스레드 종료시까지 대기 
			th2.join(); 
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("소요시간 " + (System.currentTimeMillis() - startTime));
		
		
	}

}
class ThreadEx11_1 extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i < 300; i++) {
			System.out.print(new String(""));
		}
	}
}
class ThreadEx11_2 extends Thread{
	@Override
	public void run() {
		
		for (int i = 0; i < 300; i++) {
			System.out.print(new String(""));
		}
	}
	
}
