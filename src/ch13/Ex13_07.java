package ch13;


// 인터페이스를 구현한 클래스를 만들시는 클래스 만들기에서 interface를 선택해주면 자동으로 추상메서드가 
// override가 된 상태가 됨*에러 발생 없음)
public class Ex13_07 implements Runnable {
	//메인 클래스 자신을 스레드 클래스로 만듬  
	static boolean autoSave = false;

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(0);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			if(autoSave) {
				autoSave();
			}
		}
	}
	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
	public static void main(String[] args) {
		Runnable r = new Ex13_07();
		Thread t = new Thread(r);
		//Thread t = new Thread(new Ex13_07))
		t.setDaemon(true);
		t.start(); // 데몬 스레드는 여기서 실행대기 상태에 있다가 cpu가 할당되면 run() 
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3*1000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if(i == 5) {
				autoSave = true;
			
			} 
			
		}
	}

}

