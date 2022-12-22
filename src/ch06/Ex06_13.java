package ch06;

import java.util.ArrayList;

public class Ex06_13 {

	public static void main(String[] args) {
		
		Car2 c1 = new Car2();
		
		System.out.println(c1.color);
		
		Car2 c2 = new Car2("dark");
		
		System.out.println(c2.color);
		
		Car2 c3 = new Car2("gray","manual",4);
		
		System.out.println(c3.color);
		
		ArrayList<String> al = new ArrayList<>();
		
		
		
	}

}

class Car2{
	
	String color;
	String gearType;
	int door;
	
//	Car2(){
//		this("white","auto",4); //생성자에서 다른 생성자를 호출 
//		
//	}
	
	Car2(){
		this("while");
	}
	
	Car2(String color){
		this(color,"auto",3); //파라미터로 전달받은 값은 그대로 전달, 나머지는 값을 직접 줌.
	}
	
	Car2(String color, String geatType,int door){
		// 파라미터 이름과 맴버변수 이름이 동일시는 this 키워드로 구분 ( this 이 클래스 객체) 
		
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}

class practice{
	
	practice(ArrayList<String> al){
		al.add("안");
		al.add("녕");
		
		for (int i = 0; i < al.size(); i++) {
			
			System.out.println(al.indexOf(i));
		}
		
	}
}
