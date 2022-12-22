package ch09;

public class Ex09_03 {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		//String 클래슨 equals를 재정의 하여 값이 값으면 true;
		//String 클래스는 hashcode()도 값이 같으면 동일한 해쉬코드 값을 반환토록 재정의
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//System.identityHashCode()는 object의 hashCode()처엄 객체의 주소를 반환  
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
	}

}
