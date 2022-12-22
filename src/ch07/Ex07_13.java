package ch07;

//일반클래스에서 static 메서드에서는 자기 클래스의 인스턴스맴버에 접근하려면 자기클래스 객체를 만들어 접근.

// 인스턴스메서드에서는 static 맴버나 인스턴스 맴버나 객체 없이 바로 접근 
public class Ex07_13 {

	class InstanceInner { // 인스턴스 클래스 
		
	}
	static class StaticInner { // static 클래스 
		
	}
	InstanceInner iv = new InstanceInner();
	// 인스턴스 맴버변수 iv는 InstanceInner 사용을 직접 할수 있다.
	static StaticInner cv = new StaticInner();
	// static 멤버 간에는 서로 직접 접근이 가능하다. 
	// 종류별 (인스턴스, 클래스) 메서드 안에서 내부 클래스 사용 
	static void staticMethod() {
		
	    //static 메서드는 인스턴스 맴버에  직접 접근할 수 없다.
		//InstanceInner obj1 = new InstanceInner();
		//static메서드 안에서 static내부 클래스는 바로 접
		StaticInner obj2 = new StaticInner();
		//인스턴스내부 클래스에 접근하려면 부모 (outer객체)객체를 만들어 접
		Ex07_13 outer = new Ex07_13();
		InstanceInner obj3 = outer.new InstanceInner();
		
		
	}
	void instanceMethod() { // 인스턴스형 메서드는 내부클래스의 (static , 인스턴스)의 멤버에 바로 접근  . 
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//Local클래스는 밖에서는 사용 못함.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{  // 로칼클래스 
			
		}
		LocalInner Iv = new LocalInner(); //메서드안에서는 바로 사용 
	}
	
	
	public static void main(String[] args) {
		
	}

}
