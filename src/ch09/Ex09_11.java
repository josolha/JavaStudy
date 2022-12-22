package ch09;

public class Ex09_11 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
//		StringBuffer sb = "abc"; 값으로 초기화 안됌 
		StringBuffer sb2 = new StringBuffer("abc");
		
		// ==은 참조형은 주소 비교
		System.out.println("sb == sb2 ? "+ (sb ==sb2));
		//StringBuffer는 equals는 재정의 안됨 
		System.out.println("sb.euqals(sb2) ? " + sb.equals(sb2));
		
		//StringBuffer의 내용을 String으로 변환한다.
		//toString()은 재정의가 되어 문자열을 출력
		//문자열은 equals로 값 비교가 가능 
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
