package ch09;

public class Ex09_15 {

	public static void main(String[] args) {
		int i = new Integer("100").intValue(); // intValue()는 Integer를 int로 변환
		int i2 = Integer.parseInt("100"); //바로 기본형으로 변환 
		Integer i3 = Integer.parseInt("100"); // Integer형으로 변환 
		int ix = Integer.parseInt("100"); // Integer형으로 변환되나 int로 변환이 자동  
		
		
		//진법 적용해서 변환 
		int i4 = Integer.parseInt("11000001",2); // 2진법 100을 2진수로 간주 
		System.out.println("2진법 수 : " +i4);  
		
		int i5 = Integer.parseInt("100",8); // 결과는 64
		int i6 = Integer.parseInt("100",16); // 256
		int i7 = Integer.parseInt("1AB",16); //	16*15 +15
		
		System.out.println(i7);
		//int i8 = integer.parseInt("FF"); FF는 int 에서 사용하는 숫자형태 아님 에
		
		
		
		
		
	}

}
