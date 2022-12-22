package ch07;


// 내부 클래스는 자기 클래스안에서만 사용(잘못된 사례)
public class Ex07_15 {

	public static void main(String[] args) {
		//외부 클래스인 Outer2의 내부인스턴스클래스의 객체를 생성
		//우선 외부 클래스 Outer2의 객체를 만듬 
		Outer2 oc = new Outer2();
		// 외부 클래스의 내부클래스 객체 선언시는 외부 클래스명.내부클래스명 객체명
		Outer2.instanceInner ii = oc.new instanceInner();
		System.out.println("내부인스턴스클래스의 맴버변수 : " + ii.iv);
		// 외부 클래스의 static 내부클래스의 static 맴버는 객체 생성없이 사용 가능. 
		System.out.println("Outer2.StaticInner : " + Outer2.StaticInner.cv );
		// 스태틱 내부 클래스의 인스턴스변수는 외부 클래스를 먼저 생성하지 않아도 된다.
		// Static 내부 클래스 객체를 만들어 사용 
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv :" + si.iv);
		
		
	}

}
class Outer2 {
	class instanceInner{
		int iv;
		
	}
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}