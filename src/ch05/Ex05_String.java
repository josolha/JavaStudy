package ch05;

public class Ex05_String {

	public static void main(String[] args) {
		
		String str = "ABCDE"; // String은 불변의 클래스로 변경이 불가능 
		char ch = str.charAt(3); // 문자열 str의 색인번호 3번의 문자 반환
		System.out.println("ch : "+ch);
		
		str = "012345"; //변경이 된게 아니라 새로운 str 객체가 생김
		String substr = str.substring(1,4); //str 색인번호 1번에서  4-1번 까지의 문자열 반
		System.out.println("substr : " + substr);
		
		System.out.println("equals : " + str.equals(substr));
		System.out.println(args[0]);
		System.out.println(args[1]);
		

	}

}
