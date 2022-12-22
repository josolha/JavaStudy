package ch06;

public class Ex06_04 {

	public static void main(String[] args) {
		//MyMath의 인스턴스 메서드를 이용하려면 MyMath 객체를 만듬
		MyMath mm = new MyMath();
		long result1 = mm.add(15L, 20L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		mm.name = "kook";
		MyMath.price = 100;
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("name : " + mm.name);
		System.out.println("price : " + MyMath.price);
		
		play p = new play();
		
		use.print2(p);
		
		
		System.out.println(p.a);
		
		
	}

}


class MyMath{
	
	// 클래스의 맴버는 맴버변수와 맴버메서드 (생성자 포함)
	// 맴버 메서드와 멤버변수 가진 클래스 (기본형 생성자는 포함)
	// 멤버 변수처럼 메서드도 인스턴스형과 클래스형 (static)으로 구분
	
	String name;
	static int price;
	
	long add(long a, long b)  // 선언부(리턴타임 + 메서드 이름 + (데이터형 변수1,데이터형 변수2....)
	
	{	//구현부 (메서드가 처리하는 문장들)
		long result = a + b ; //파라메터 변수 a,b는 호출시에 전달 받은 값을 가진다.
		return result;
		
	}
	
	long substract(long a, long b) {
		long result = a -b;
		return result;
	}
	
	long multiply(long a, long b) {
		long result = a*b;
		return result;

	}
	double divide(double x, double y) {
		double result = x / y;
		return result;
	}
}
// 객체 반환도 가능하고 참조형 반환도 가능함.

class play{
	int a = 0;
	static void print() {
		System.out.println("play클래스의 메서드 ");
	}
}

class use{
	static void print2(play b) {
		b.a =10;
		System.out.println("use클래스의 메서드 ");
	}
}


