package ch07;

public class Ex07_16 {

	public static void main(String[] args) {
		
		OuterEx0716 out = new OuterEx0716();
		OuterEx0716.Inner inner = out.new Inner();
		inner.method1();
	}

}

class OuterEx0716{
	int value = 10; //OuterEx0716의 맴버변수  : OuterEx0716.this.value
	
	class Inner {
		int value = 20; // 내부 클래스 inner의 맴버변수 :  this. value 
		void method1() {
			int value = 30; // Inener 내부 클래스의 로컬 변수 : value 
			System.out.println("		value : " + value);
			System.out.println("	this.value : " + this.value);
			System.out.println("OuterEx0716.this.value : " + OuterEx0716.this.value);
		}
	}
}
