package ch13;

public class Ex13_10 {

	public static void main(String[] args) {
		
		RunImpleEx10 r = new RunImpleEx10();
		
		Thread th1 = new Thread(r, "*"); // 2번째 문자열은 스레드 이름 
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		
		
		th1.start();
		th2.start();
		th3.start();
		
		//main 스레드 
		try {
			Thread.sleep(2000);
			th1.suspend(); // th1을 일시 중단 
			Thread.sleep(2000);
			th1.suspend(); 
			Thread.sleep(3000);
			th1.resume(); // suspend된 스레드 재 실행 
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}

}
class RunImpleEx10 implements Runnable{
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}