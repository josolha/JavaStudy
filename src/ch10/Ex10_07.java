package ch10;

import java.text.DecimalFormat;

public class Ex10_07 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##"); 
		DecimalFormat df2 = new DecimalFormat("#.###E0"); // 지수방식의 패턴  E는 10의 몇승  
		
		try {
			Number num = df.parse("1,234,567.89");
			//parse 메서드는 패턴형식의 문자열을 숫자로 변경(,사용안함) 
			System.out.print("1,234,567.89" + " -> ");
			
			double d = num.doubleValue(); // num이 참조변수형이므로 기본형으로 바꿈 
			d = (double)num; //언박싱 
			System.out.print(d + " -> ");
			System.out.println(df2.format(num)); // format 메서드는 숫자를 패턴형식의 문자열로 변환 
			
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
			
		}
		
	}

}
