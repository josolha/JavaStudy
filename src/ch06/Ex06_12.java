package ch06;

public class Ex06_12 {

	public static void main(String[] args) {
		
		Car c1 = new Car();  // 기본형 생성자로 만듬 (초기화를 못함)
		c1.color = "white";  // 인스턴스로 접근하여 만듬 
		c1.gearType = "auto";
		c1.door =4;
		
		
		Car c2 = new Car("Dark","manual",3);
		System.out.println("c2 color : " + c2.color);
		System.out.println("c2 gearType : " + c2.gearType);
		System.out.println("c2 door : " + c2.door);
		System.out.println("c2 total : " + c2.color +"\t"+ c2.gearType +"\t"+ c2.door);
		
	}
}

class Car{
	
	String color;
	String gearType;
	int door;
	
	Car(){  // 기본 생성자를 명시적으로 만듬

	}
	Car(String c, String g, int d){ // 초기화를 위해 파라미터 사용. 
		this.color = c;
		this.gearType = g;
		this.door = d;
	}
	
}
