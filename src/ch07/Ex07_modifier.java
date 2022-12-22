package ch07;

public class Ex07_modifier { // public 형 클래스 
	
	private int x ; // private 형 맴버변수  (동일 클래스 안에서만 접근)
	int y ;  // 디폴트형 맴버 변수 (같은 패키지 클래스 어디서나 접근)
	protected int z; // 자식클래스가 자기 클래스와 자식클래스가 다른 패키지의 있더라도 부모 클래스는 접근 가능
	public int a; // 모든 다른 패키지에서도 접근 가능 

	//메서드도 맴버 변수와 같은 modifier 사용 가능
	
}

class Modi01 { // 디폴트(기본형) 클래스 
	
	Ex07_modifier md = new Ex07_modifier();
	//md.x ;
//	int x = md.x;
	int y = md.y;
	int z = md.z;
	int a = md.a;
	
}

//private class Pclass{ // private 사용 불가. 
//	
//}


//protected class Pclass{ // protected도  사용 불가능 . 
//	
//}