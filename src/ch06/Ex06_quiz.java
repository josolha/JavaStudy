package ch06;

public class Ex06_quiz {
	//1. 인스턴스형 변수를 문자열 변수 String
	String st;
	//2. 클래스형 변수로 number
	static  int number;

	public static void main(String[] args) {
		
		//1. Mymethod 호출 
		myMethod(); // 같은 클래스이고 동일한 static 메서드 이므로 클래스 이름 없이 호
		
		//2. 오버로딩한 메서드 (1번) 호출 
		myMethod("조솔하");
		
		//3. 오버로딩한 메서드 (2번) 호출 
		myMethod(10);
		
		//4.checkAge  메서드 호출 
		checkAge(28);
		
		//5.instanceMethod 호출
		Ex06_quiz ex = new Ex06_quiz();
		ex.instancMethod("안녕");
		
		//6. String변수에 값 abcde 대입
		ex.st = "abcde";
		
		//7. number 변수에 20
		number = 20;
		
		//MyCar 객체 car1생성 -- 기본형으로 만들고 맴버변수 초기
		MyCar mc = new MyCar();
		
		//MyCar 객체 car2생성 -- 파아메터 있는 생성자로 만들고 맴버변수 초기		
		MyCar mc2 = new MyCar(10,"white",28);
	
		
	}
	static void myMethod() {
		System.out.println("i just got executed!");
	}
	//1. myMethod를 오버로딩한 메서드 만듬 (파라미터는 변수는 문자열 name이고 구현부는 name을 출력 )
	static void myMethod(String name) {
		System.out.println(name);
	}
	//2. myMethod를 오버로딩한 메서드 만듬 (파라미터는 변수는 int x이고 구현부는 x + 5를 출력 ) 
	static void myMethod(int x) {
		System.out.println(x+5);
	}
	//3. 리턴 타입이 없고 파라메터가 int age인 checkAge메서드를 클래스형으로 만듬
	// 구현부는 파라미터 age 출력
	static void checkAge(int age) {
		System.out.println(age);
	}
	//4. 인스턴스 메서드로 리턴타입은 문자열 이름은 instancMethod 파라메터는 문자열 str로 하고
	// 구현부는 str출력
	String instancMethod(String str) {
		System.out.println(str);
		return str;
	}
	
	
	

}
//클래스 MyCar만들기

//맴버변수 int price, String color, int age 작성
//기본형 생성자 만들기
// 세개의 파라미터를 사용한 생성자 만들고 맴버변수 초기화 하기

class MyCar{
	
	int price;
	String color;
	int age;
	
	MyCar(){
		
	}
	MyCar(int price, String color, int age){
		this.price =price;
		this.color=color;
		this.age = age;
	}
}
