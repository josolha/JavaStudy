package ch08;

public class Ex07_04 {

	public static void main(String[] args) {
	
		System.out.println(1);
		System.out.println(1);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithemetic"); // 일치하는 catch 문에서 
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		// 만일 예외의 상위 클래스인 Exception catch블록이 위에 있으면 컴파일 에러
		// 위에 있으면 아래의 Arithemetic ~~
		System.out.println("out");
	}

}
