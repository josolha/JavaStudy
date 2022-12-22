package ch09;

import static java.lang.Math.*; // 사용시 Math 클래스 이름을 생략하고 사용 
import static java.lang.System.*; // 사용시 System 클래스 이름을 생략하고 사용 

public class Ex09_13 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val +")= " + round(val));
		//round는 소수점 첫째 자리에서 반올림하여 long형 정수를 반환
		
		val *= 100;
		out.println("round(" + val +")= " + round(val));
		//소수점 3번째 자리에서 반올림
		
		out.println("round(" + val +")/100 = " + round(val)/100);
		//정수/정수는 정수(소수점이하 버림)
		
		out.println("round(" + val +")/100.0 = " + round(val)/100.0);
		//round(val)은 long이고 100.0은 double 이므로 결과는 double 
		//100을 곱해서 100.0으로 나누면 소수점 3자리에서 반올림된 결과 나옴 
		out.println();
		out.printf("ceil(%3.1f)=%3.1f%n", 1.1, ceil(1.1)); //올림. 
		//ceil(double d)은 double형 소수점을 무조건 올림한 double 형을 반환 
		
		out.println("floor()메서드는 무조건 내림 " + floor(1.5));
		//floor(double d)를 무조건 내림하여 double 형으로 반환
		
		out.println("rint메서드는 가장 가까운 정수값을 반환하나 정중앙의 값인 .5는"+ "짝수값을 반환 = " + rint(1.5));
		//음수의 처리
		out.println("음수의 처리는 절대값이 적은수로 반올림 : " + round(-1.5));
		out.println("음수의 처리는 큰값으로 무조건 반올림 : " + ceil(-1.5));
		out.println("음수의 처리는 적은수로 무조건 반올림 : " + floor(-1.5));
		
		
	}

}
