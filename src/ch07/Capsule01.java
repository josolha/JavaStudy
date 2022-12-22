package ch07;

public class Capsule01 {
	
	public static void main(String[] args) {
		
		Capsule10 c =  new Capsule10("2022","10","24",18,46,42);
		
	
	}

}

class Capsule10{
	private String year;
	private String month;
	private String day;
	private int hour;
	private int minute;
	private int second;
	
	public Capsule10(String year, String month, String day, int hour, int minute, int second) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
}
