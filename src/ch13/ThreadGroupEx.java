package ch13;

public class ThreadGroupEx {

	public static void main(String[] args) {
		
		ThreadGroup myGroup = new ThreadGroup("myGroup"); // 그룹명이 myGroup
		//그룹명과 스레드 이름을 사용하는 스레드 생성자를 호출 
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		//동일 그룹에 속하는 스레드를 
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main 스레드 그룹의 list() 메소드 출력 내용 ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		
		mainGroup.list();
		//프린트하는 메서드, 메인스레드 그룹에서 만들었으므로 메인 스레드 그룹에 myGroup이 포함 
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("[ myGroup 스레드 그룹의 interrupt() 메소드 출력 내용 ]");
		myGroup.interrupt();  // sleep를 중단함 
				
	}

}

class WorkThread extends Thread{
	
	public WorkThread(ThreadGroup threadGroup, String threadName){
		super(threadGroup, threadName);
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			
			}catch(Exception e) {
				System.out.println(getName() + "interrupted");
				break; //while문 탈출 
			}
		}
		System.out.println(getName() + "종료됨");
	}
	
}
