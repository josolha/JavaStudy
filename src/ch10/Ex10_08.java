package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_08 {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9 ;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
		//E는 요일 표시, '는 특수문자 앞에 붙여서 특수문자를 일반 문자로 처리  
		sdf3 = new SimpleDateFormat("''yyyy-MM-dd HH:mm:ss.SSS");
		//H 0~23시 표시 S는 밀리세컨 
		sdf4 = new SimpleDateFormat("''yyyy-MM-dd hh:mm:ss a");
		//a는 오전,오후 표시 h는 1~12로 시간 표시
		sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
		//D는 년의 몇번째 일 표시
		sdf6 = new SimpleDateFormat("오늘은 올 해의 d번째 날입니다.");
		//d는 월의 몇번째 일 
		sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
		//w는 년의 몇번째 주 
		sdf8 = new SimpleDateFormat("오늘은 올 해의 W번째 주입니다.");
		//W는 월의 몇번째 
		sdf9 = new SimpleDateFormat("오늘은 올 해의 F번째 E입니다.");
		//
				
	
		
		System.out.println(sdf1.format(today)); // format은 data를 문자열로 변환 
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
	}

}
