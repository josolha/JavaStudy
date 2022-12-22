package ch06;
	
	// TV 클래스는 rv 객체를 만드는 template
public class Tv{
		// 클래스를 구성하는 멤버는 멤버변(속성)와 메서드(기능), 생성자
		// 멤버변수 
		String color; // 기본 값 null
		boolean power; // 
		int channel;
		
		//멤버 메서드
		void power() {
			power = !power;
		}
		void channelUp(){
			++channel;
		}
		
		void channelDown(){
			--channel;
		}
//		static void name() {
//			System.out.println("hello");
//		}
//		static int channel12 = 2;
		
	}
