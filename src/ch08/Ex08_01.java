package ch08;

public class Ex08_01 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			//예외발생하는 문자에서 해당 예외를 catch문으로 던져줌 
			//예외 발생 없으면 try~catch 문은 종료 (catch 문은 안거침)
			System.out.println(2);
			System.out.println(3);
		}
		catch(Exception e) {
			System.out.println(4);
		}
		System.out.println(5);
	}

}
