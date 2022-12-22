package ch06;

import ch05.usepublic;
//import ch06project.Tv;

public class Ex06_01 {

	public static void main(String[] args) {
		
		Tv t = null; // 데이터 형이 Tv라는 클래스이므로 변수 t는 참조형 변수(객체) 
		
		System.out.println(t); // new로 인스턴스화 안하면 메모리가 할당 안되어 주소가 없음 
		t = new Tv();
		
		
		Tv t1 = new Tv();
		System.out.println(t1); // new로 인스턴스화 했기 때문에 주소가 주어짐  
		
		
		t.channel = 6;  
		t1.channel = 7; // 인스턴스는 클래스의 멤버 변수에 객체.맴버변수로 접근 
		
		t.channelDown();
		t1.channelDown();
		
		System.out.println("t의 채널은 " + t.channel);
		System.out.println("t1의 채널은 " + t1.channel);
		
		
		usepublic.hello();
		
		usepublic us = new usepublic();
		System.out.println(us.c);
//		System.out.println(us.a);
		
		us.getterA();
		
	}

}


