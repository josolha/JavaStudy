package ch06;

public class Ex06_Call {
	
	int s1;
	static int s2;

	public static void main(String[] args) {
		
		//동일 클래스에서 static 메서드안에서 static메서드 호출
		classmethod(); // 클래스 이름 없이 사용 
		
		//동일 클래스에서 static 메서드에서 인스턴스 메서드 호출
		Ex06_Call ex1 = new Ex06_Call(); //객체 생성
		ex1.instancemethod1(); //객체.메서드로 접근 
		
		//static 메서드에서 static 변수는 클래스 이름없이 접근 
		s2 = 10;
		//static 메서드 안에서 instance 변수는 객체.변수명으로 접
		ex1.s1 = 10;
	}
	
	void instancemethod1() {
		//인스턴스메서드에서 인스턴스메서드 호출은 객체 없이 호출
		instancemethod2();
		//인스턴스메서드에서 static메서드 호출은 클래스나 객체 없이 호출
		classmethod();
		
		//인스턴스메서드에서는 모두 이름없이 접근
		s1 = 5;
		s2 = 10;
	}
	void instancemethod2() {
		
		//인스턴스메서드에서 인스턴스메서드 호출은 객체 없이 호출
		instancemethod1();
		classmethod();
		
	}
	
	static void classmethod() {
		Ex06_Call ex2 = new Ex06_Call(); //객체생성 
		ex2.instancemethod1();
		
	}


}

