package ch07;

public class Ex07_Capsule {

	public static void main(String[] args) {
		TestDTO dto = new TestDTO(12,35,30);
		//dto. hour; hour가 private이므로 접근 불가
		//public 으로 된 메서드를 통해서 접근 
		System.out.println("hour : "+dto.getHour()+" Minute : "+dto.getMinute()+" second : " + dto.getSecond());
		
		//값을 변경시는 setter를 사용
		dto.setHour(16);
		dto.setMinute(30);
		dto.setSecond(25);
		
		System.out.println("hour : "+dto.getHour()+" Minute : "+dto.getMinute()+" second : " + dto.getSecond());
//		dto.getHour();
//		dto.getMinute();
//		dto.getSecond();
		
	}

}

class TestDTO {
	
	// 캡슐화를 위해서는 맴버 변수를 바로 접근이, 불가능한 private
	// 접근은 getter, setter (get,set 메서드)를 public으로 하여 접근 
	private int hour;
	private int minute;
	private int second;
	
	public TestDTO(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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
