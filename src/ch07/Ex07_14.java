package ch07;

public class Ex07_14 {
	
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{ // 인스턴스형 내부 클래스는 부모클래스의 맴버 이므로 내부것은 사용 가능
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	static class StaticInner { // static형 내부 클래스 
		//static은 static 맴버는 그대로 사용하나 인스턴스 맴버는 부모 객체를 만들어 사용 
		//int siv = outerIv;
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		int lv = 0;
		final int Lv = 0;
		
		class LocalInner{ // 로칼형 내부 클래스, 메서드 안에 만듬, 지역변수 처럼 동작
			
			int liv = outerIv;
			int liv2 = outerCv;
			// 메서드 안에서 사용하는 로컬 변수는 final을 붙여서 사용하나 자바 1.8부터는 자동 첨가됨. 
			int liv3 = lv;
			int liv4 = Lv;
			
		}
	}

}
