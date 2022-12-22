package ch10;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Ex10_09 {

	public static void main(String[] args) {
		DateFormat df1 = new SimpleDateFormat("yyyy년MM월dd");
		//DateFormat은 추상클래스로 SimpleDateFormat 부모 클래스 
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		Date d = null;
		
		try {
			d = df1.parse("2019년 11월 23일"); 
			//패턴에서 공백은 처리 
			//패턴과 다른 문자열을 주면 예외 발생 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(d);
		
		String ds = df2.format(d);
		System.out.println(ds);
	}	

}
