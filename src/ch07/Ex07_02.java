package ch07;

public class Ex07_02 {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();
		
		System.out.println();
		
		Child2 c2 = new Child2();
		c2.method();
		
		
	}

}

class Parent{
	int x = 10;
}

class Child extends Parent{
	int x = 20; //부모 클래스의 멤버변수와 동일한 이름이면 부모 멤버변수는 가려져서 안보임
	
	void method() {
		System.out.println("x ="+ x); // 자기클래스 맴버변수 X
		System.out.println("this. x = " + this.x); // this는 자기클래스 인스턴스 
		System.out.println("super. x = " + super.x); // 부모클래스를 나타내는 super 
	}
}

class Parent2{
	int x = 10;
}

class Child2 extends Parent2{
	void  method() {
		System.out.println("x ="+ x);  //x는 부모에만 있으므로 안가려짐 
		System.out.println("this. x = " + this.x); 
		System.out.println("super. x = " + super.x);
	}
}