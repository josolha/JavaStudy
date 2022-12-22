package ch09;

public class Ex09_10 {

	public static void main(String[] args) {
		int ival = 100;
		String strVal = String.valueOf(ival); // int를 문자열로 
		
		double dval = 200.0;
		String strVal2 =200.0 +""; // 연결 연산자 +를 이용 200.0이 문자열로 변경
		//각 wrapper 클래스의 parse 데이터형 메서드를 이용 기본형으로 변경 
		double sum = Integer.parseInt("+"+ strVal) + Double.parseDouble(strVal2);
		//각 wrapper 클래스의 valueof 메서드를 이용하여 기본형으로 변경 
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		//Wrapper.valueOf는 반환이 기본형이 아니고 기본형의 객체형 
		
		
		System.out.println(sum);
		System.out.println(sum2);
		
		System.out.println(String.join("",strVal,"+",strVal2,"=")+sum);
		//join(구분자,뒤의 파라메터는 문자열을 이용하여 연결된 문자열을 만들어 줌 )
		//...는 파라메터 수가 가변형(varvargs)
	}

}
