package ch07;

public class Ex07_11 {

	public static void main(String[] args) {
		ChildEx0711 c = new ChildEx0711();
		c.method1(); // ChildEx0711의 메서드 사용
		c.method2(); // ParentEx0711의 메서드 사용 
		
		//static 메서드는 인터페이스 이름으로 접근 
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
	}

}
class ChildEx0711 extends ParentEX0711 implements MyInterface, MyInterface2{
	//  구현한 인터페이스의 default 메서드가 충돌 
	//  MyInterface, MyInterface2 의 method1
	//  인터페이스를 구현한 ChildEx0711 클래스에서 그 메서드를 재정의 
	@Override
	public void method1() {
		System.out.println("method1() in child3"); //오버라이딩  
	}
	// 상속한 메서드 method2가 인터페이스의 default 메소드 method2와 충돌시는
	// 조상의 메소드가 상속된다. 
}


class ParentEX0711{
	public void method2() {
		System.out.println("method2() in Parent3");
	}
	
}

interface MyInterface {
	
	//추상 메서드가 없는 인터페이스 
	default void method1() { // 인터페이스에 있는 일반 인스턴스형 메서드 
		System.out.println("method1() in MyInterface");
	}
	default void method2() { // 인터페이스에 있는 일반 인스턴스형 메서드 
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
	
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
	
}