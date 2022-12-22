package ch09;

public class Ex09_14 {

	public static void main(String[] args) {
		
//		Integer i = new Integer(100); // 자바 9 부터는 비 권고 
		Integer i = 100; // 자동으로 컴파일러가 오토박싱해서 참조형으로 변환
		Integer i2 = 100;
		
		System.out.println("i ==i2 ? " +(i==i2));
		// String 처럼 값으로 초기화하면 컴파일 동일값은 1개만 지정해서 공동 사용
		System.out.println("equals로 비교 : " +i.equals(i2));
		// equals는 자바에서 값을 비교하도록 재정의
		// 원래 compareTo wrapper 객체에 비교 연산이 안되어 제공됨
		// 지금은 비교 연산이 잘됨. 
		System.out.println("i.compareTo(i2)=" + i.compareTo(i2));
		//int java.lang.Integer.compareTo(Integer anotherInteger)
		//리턴 타입이 int로 같으면 0이 나옴 다르면  - 값  
		//toString도 오버라이딩 되어 있음. 
		System.out.println("i.toString()=" + i.toString());
		
		//각 Wrapper 클래스별 상수가 지정되어 있음 .
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + "bits");
		System.out.println("BYTES = " + Integer.BYTES + "bites");
		System.out.println("TYPE = " + Integer.TYPE);
	}

}
