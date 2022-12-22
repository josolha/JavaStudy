package ch10;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
		
		Calendar date = Calendar.getInstance();
		
		date.set(2019,7,31);
		System.out.println(toString(date));
		date.add(Calendar.DATE,1);  //1일 후
		System.out.println(toString(date));
		
		date.add(Calendar.MONTH, -6);
		System.out.println(toString(date)); //6개월전 
		
		//roll
		date.roll(Calendar.DATE, 30);
		System.out.println(toString(date)); //자기필드만 수정
		
		date.add(Calendar.DATE, 31);
		System.out.println(toString(date)); //


		
	}
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+ "년" + (date.get(Calendar.MONTH) +1 ) + "월"
				+date.get(Calendar.DATE) + "일";
	}

}
