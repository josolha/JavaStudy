package ch07;

public class Ex07_12 {
	
	class InstanceInner{  // 인스턴스형 내부 클래스 
		int iv = 100;
//		static int cv = 100;  static 맴버변수는 static 내부 클래스에만 사용 
		final static int CONST = 100; // 상수는 instance 내부 클래스에서도 사용 가능
	}
	
	static class StaticInner{ //static형 내부 클래스 
		int iv = 200;
		static int cv = 200; // static 내부 클래스에서는 static 변수 사용 가능
		final static int CONST = 100;  
	}
	
	void myMethod() {
		class LocalInner { // 지역형 내부 클래스 
			int iv = 300;
//			static int cv  = 200; //로컬 클래스에서도 Static 사용 불가. 
			final static int CONST = 300; // 상수는 로컬 클래스에서도 가능  
		}
	}

	public static void main(String[] args) {
		// 자기 클래스에서 내부 클래스 접근은 클래스의 상수나 static 변수 접근은 클래스이름으로 가능. 
		System.out.println(InstanceInner.CONST);
		//System.out.println(InstanceInner.iv);  접근 불가 
		System.out.println(StaticInner.cv);
		//System.out.println(StaticInner.iv);  인스턴스 변수는 접근 불가 
		
		
	}

}
