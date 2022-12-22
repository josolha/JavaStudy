package ch08;

public class Ex08_02 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(0/0);  // 수학적으로 0으로 나누는 것은 부정으로 예외 발
			System.out.println(2);
		}
		//catch(ArithmeticException ae) {
		catch(Exception e) {	
			//ArithmeticException는 수학 계산 관련 예외
			System.out.println(3);
			//ae.printStackTrace();
			e.getMessage();
		}
		System.out.println("try~catch 문장 ");
	}

}
