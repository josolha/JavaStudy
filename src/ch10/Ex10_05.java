package ch10;

import java.util.Calendar;
import java.util.Iterator;

public class Ex10_05 {

	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("입력법 : 2022 11");
			return;
		}
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		sDay.set(year,month-1,1); // 입력받은 달의 1일 
		eDay.set(year,month,1); // 다음달 1일 
		
		eDay.add(Calendar.DATE,-1); //전달 마지막 일
		
		// 첫 번쨰 요일이 무슨 요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK); // DAY_OF_WEEK는 1(일요일) 부터 7
		
		//eDay에 지정된 날짜를 얻어온다. (마지막일)
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("          "+ args[0] + "년 " + args[1] + "월");
					
		//1일이 어느 요일인가에 따라 앞의 요일 밑은 공백으로 채움  
		for (int i=1, n=START_DAY_OF_WEEK ; i<= END_DAY; i++,n++) {
			if(i==1) {
				System.out.println("  SU  MO  TU  WE  TH  FR  SA");
				for (int j = 1; j < START_DAY_OF_WEEK; j++) {
					System.out.print("    ");
				}
			}
			System.out.print((i<10)? "   " + i : "  " +i);
			if(n%7==0)System.out.println();			
		}
		
	}

}
