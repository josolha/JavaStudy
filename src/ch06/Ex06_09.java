package ch06;

public class Ex06_09 {
	
	
	public static void main(String[] args) {
		
		// static 메서드 호출 
		System.out.println(MyMath2.add(200L, 200L));
		System.out.println(MyMath2.subtract(200L, 200L));
		System.out.println(MyMath2.multiply(200L, 200L));
		System.out.println(MyMath2.divide(200L, 200L));
		
		
		
		//인스턴스메서드 호출
		MyMath2 mm  = new MyMath2();
		mm.a = 200L;
		mm.b = 200L;
		
		//인스턴스메서드는 파라메터 없이 구현부에서 인스턴스변수를 사용 
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
				
		
	}

}


class MyMath2{
	long a,b; // 인스턴스 변수 
	
	long add() { //리턴타입이 long형, 파라미터는 없음.
		
		return a+b; //a,b는 인스턴스 변수 사용하므로 인스턴스 메서드 
	}
	long subtract() {
		return a-b; //a,b는 인스턴스 변수 사용하므로 인스턴스 메서드 
	}
	long multiply() {
		return a*b; //a,b는 인스턴스 변수 사용하므로 인스턴스 메서드 
	}
	long divide() {
		return a/b; //a,b는 인스턴스 변수 사용하므로 인스턴스 메서드 
	}
	static long add(long a, long b) { //매개변수 a,b(인스턴스변수 a,b와 상관없는 a,b)
		return a + b; // 인스턴스변수 a,b 를 사용안하므로 static 으로 해도 무방
	}
	static long subtract(long a, long b) {
		return a-b; 
	}
	static long multiply(long a, long b) {
		return a*b; 
	}
	static long divide(long a, long b) {
		return a/b; 
	}
	
	
}