package ch10;

import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		//기본적으로 현재 날짜와 시간으로 설정됨 
		Calendar today = Calendar.getInstance();
//		System.out.println(today.get(today.YEAR));
		System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH));
		System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		
		// DATE와 DAY_OF_MONTH는 같다 (날짜) 
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE));
		System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("이 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일(1~7, 1:일요일) : " + today.get(Calendar.DAY_OF_YEAR)); //1: 일요일 2:월요일 7:토요일 
		System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전_오후(0:오전, 1:오후) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("10000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
		//ZONE_OFFSET는 표준시(영구을 기준)를 기준으로 하여 그지역의 표준시와의 차이 (밀리세컨드로 되어 있어 1시간의 
		//밀리초 60분 * 60초 *1000 
		System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE)); // 이 달의 마지막  
	}

}
