package ch08;

public class Ex08_09 {

	public static void main(String[] args) throws Exception{
		try{
			method1();
		}
		catch(Exception e){
//			e.printStackTrace();
			System.out.println("main 까지 옴.");
		}
	}
	static void method1() throws Exception {
		// 예외가 위임되면 예외처리를 해줘야 에러 없음 
		/*  
		try {
			method2();
			
			
		}catch(Exception e) {
			
		}
		*/
		method2();
		
	}
	static void method2() throws Exception { // Exception 예외 처리를 호출한 메서드로 위임 
		/* 자기 메서드 내에서 처리 
		try {
			throw new Exception();
			
		}catch(Exception e) {
			
		}
		*/
		throw new Exception();
	}

}
