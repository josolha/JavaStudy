package ch07;

//클래스 없이 static 맴버 호출 
import static java.lang.System.out; //out은 static 변수 
import static java.lang.Math.*; // Math클래스의 모든 static 변수나 메서드 

public class Ex07_06 {

	public static void main(String[] args) {
		System.out.println(Math.random());
		System.out.println(random()); //클래스명 Math생략. 
		
		System.out.println("Math.PI : " + Math.PI);
		System.out.println(PI);
		
	}

}
