package ch10;

import java.text.DecimalFormat;
import java.util.Iterator;

public class Ex10_06 {

	public static void main(String[] args) {
		double number = 1234567.89;
		String[] pattern = { 
			"0", // 10진수 표시, 소수점 없음 
			"#", //  10진수 표시 
			"0.0", // 소주점 1자리 10진수  
			"#,###.##", // 소주점 아래 2자리 세자리로 구분하여, 사용 
			"\u00A4 #,###" // 세자리로 ,로 구분하고 통화(원화 돈단위) 표시  
		};
		
		for (int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			//format(숫자) 메서드는 숫자를 pattern이 지정한 형태의  문자열로 변환  	
			System.out.println("pattern값 : " + pattern[i] + "변환값 : " + df.format(number));
		    
		    
		}
//		pratice.pattern(pattern);
		}
}



class pratice{
	static void pattern(String[] pattern) {
		
		double number = 1234567.89;
		
		for (int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.println(pattern[i]+" : "+ df.format(number));
		}
				
	}
}