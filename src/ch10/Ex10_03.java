package ch10;

import java.util.Calendar;

public class Ex10_03 {

	public static void main(String[] args) {
		final int[] TIME_UNIT = { 3600, 60, 1 };
		final String[] TIME_UNIT_NAME = { "시간", "분", "초" };

		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();

		time1.set(Calendar.HOUR_OF_DAY, 10); // 24시 기준 시간을 10시로 변경
		time1.set(Calendar.MINUTE, 20);
		time1.set(Calendar.SECOND, 30);

		time2.set(Calendar.HOUR_OF_DAY, 20);
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);

		long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000; // 두시간의 초 차이
		System.out.println("time1과 time2의 차이는 " + diff + " 초입니다. ");

		String tmp = "";
		for (int i = 0; i < TIME_UNIT.length; i++) {
			tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			diff = diff % TIME_UNIT[i];
		}
		System.out.println("시분초로 변환하면 " + tmp + "입니다 ");

	}

}
