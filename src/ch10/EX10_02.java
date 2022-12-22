package ch10;

import java.util.Calendar;

public class EX10_02 {

	public static void main(String[] args) {
		
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금",""};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
//		System.out.println("초(0~59) : " + date1.get(Calendar.SECOND));
//		System.out.println("초(0~59) : " + date2.get(Calendar.SECOND));
//		System.out.println("10000분의 1초(0~999) : " + date1.get(Calendar.MILLISECOND));
//		System.out.println("10000분의 1초(0~999) : " + date2.get(Calendar.MILLISECOND));
		
		//set 메서드중 set(년,월,일)을 사용
		date1.set(2019,3,29); // 2019년 4월 29일
		//date1.set(2019,Calendar.APRIL,29)
		System.out.println("date1은 "+ toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]+ "요일이고,");
		System.out.println("오늘(date2)은" + toString(date2)
		+DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일입니다.");
		
		//두 시각의 차이는 밀리세컨드로 반환하는 getTimeMillis()를 사용하여 구한다
		//getTimeMillis()는 1970.1.1 0시0분0초를 기준으로 하여 경과한 밀리세컨드 posix 또는 unix 타임이라 한다 
		long diff = (date2.getTimeInMillis()-date1.getTimeInMillis()) / 1000 ; //초로 변환 
		System.out.println("그날(date1)부터 지금 (date2)까지 " + diff + "초가 지났습니");
		
		System.out.println("일(day) 로 계산하면 " + diff/(24*60*60) + "일입니다."); // 1일 = 24*60*60
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+ "년" + (date.get(Calendar.MONTH) +1 ) + "월"
				+date.get(Calendar.DATE) + "일";
	}

}
