package ch08;

import javax.naming.PartialResultException;

public class Ex08_Quiz {

	public static void main(String[] args) {
		
		

		//실행시에 에러가 발생 (RuntimeException) 하는데 이를 수정 
		
		//예외가 발생하거나 안하거나 거치는 블록을 만들고 try~catch문 종료를 출력 
		
		//이 위치에서 checkAge 메서드를 호출하는데 인자로 15를 사용
		
		try {
			int[] myNumber = {1,2,3,4,5};
			System.out.println(myNumber[10]);
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("예외 내용 : " + e.getMessage());
			
		}finally {
			System.out.println("try ~ catch문 종료 ");
			
		}
		checkAge(15);  // static 메서드인 main 안에서 이름으로 호출하는 메서드는 static메서드임  
		
	}
	static void checkAge(int age) {

		if(age <18) {
			 System.out.println("18살 미만입니다 ");
			 try {
				 throw new ArithmeticException("예외 발생 "); 
				 
			 }catch(ArithmeticException e){
				 e.printStackTrace();
				 System.out.println("예외 내용 :" + e.getMessage());
			 }
			
		}else {
			System.out.println("18세 이상이므로 충분한 연령입니다");
		}
	}
	
	//checkAge메서드를 만든다. 리턴해주는 결과는 없고 파라미터는 int형을 사용한다.
	// 메서드 블록은 전달받은 값이 18 보다 적으면 산술예외를 발생시키는데 메세지로 18살 미만 입니다를 사용 
	// 18이상이면 충분한 연령입니다 를 출력 
}
		
//class RuntimeException extends Exception{
//	RuntimeException(String msg){
//		super(msg);
//	}
//}


