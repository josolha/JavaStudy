package ch08;

public class Ex08_05 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(4);
			
		}
		catch(Exception e) {
			e.printStackTrace(); // call-stack에 있는 메서드를 정보  
			System.out.println("예외 메시지 : " + e.getMessage()); // 해당 예외 내용
			
		}
		System.out.println("try~catch 밖");
	}

}
