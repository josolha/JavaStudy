package ch10;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner scanner = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를" + pattern + "의 형태로 입력해 주세요 " 
				+ "(입력예 : 2022/11/03");
		
		while(scanner.hasNextLine()) { // 버퍼에 값이 없을때까지  (처음에 무조건 들어감)
			try {
				inDate = df.parse(scanner.nextLine());
				break;
			}
			catch(Exception e) {
				System.out.println("날짜를 " + pattern + "의 형태로 다시 입력해주세요"
						+ "(입력예:2019/12/31)");
				
			}
		}
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(inDate); // Date 객체를 Calendar 객체로 변환 
		
		
		Date d = new Date(cal.getTimeInMillis()); // cal을 posix로 변경하여 Date로 변환
		
		Calendar today = Calendar.getInstance();
		
		long day = (cal.getTimeInMillis() - today.getTimeInMillis()) / (1000 * 60 * 60);
		
		System.out.println("입력과 오늘의 시간차이는 : " + day);
		

	}

}
