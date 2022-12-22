package ch09;

public class Ex09_06 {

	public static void main(String[] args) {
		String str1 = "abc"; 
		//생성자를 사용 안하고 값을 직접 주어서 객체를 만듬 
		//class가 컴파일될시 값으로 저장
		//동일한 값이면 원래 있던것만 사용 
		String str2 = "abc";
		//str1과 str2는 메모리 번지가 같음.
		
		System.out.println("String str1 = \"abc\";");
		// \특수문자 는 escapse sequence 처리
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? "+ (str1 == str2));
		// == 은 참조형에서는 주소 비교
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//String에서는 equals는 값을 비교 하도록 오버라이딩 해놓음 
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new 생성자 사용해서 만든 참조변수는 주소가 다 다름.
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? "+ (str3 == str4)); //번지 비교 
		System.out.println("str3.equals(str4) ? " + str3.equals(str4)); // 값 비교 
		
	}

}
