package ch08;

public class Ex08_Finally {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
//			deleteTempFiles();
			throw new Exception();
			
		}
		catch(Exception e) {
			e.printStackTrace();
//			deleteTempFiles();
			return; // 이 메서드 main을 종료하는데 finally는 실행하고 종료 
		}
		
		finally { // try~catch 에서 무조건 거치는 공통 영역
			System.out.println("finally 영역");
			deleteTempFiles();
		}
//		System.out.println("try~catch 블록밖 ");
		
		
	}
	static void startInstall() {
		
	}
	static void copyFiles() {
		
	}
	static void deleteTempFiles() {
		
	}


}
