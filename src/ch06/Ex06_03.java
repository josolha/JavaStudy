package ch06;

public class Ex06_03 {

	public static void main(String[] args) {
		//Card클래스의 static	변수는 클래스.변수명으로 접근.
		System.out.println("Car.width = " + Card.width);
		System.out.println("Car.width = " + Card.height);
		
		//Card의 인스턴스 변수 kind와 number는 인스턴스를 생성후 사용 가능
		Card c1 = new Card();
		c1.kind ="Heart";
		c1.Number =  7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.Number = 4;
		
		System.out.println();
		System.out.println("c1은" + c1.kind+ ", "+ c1.Number + "이며");
		System.out.println("크기는 " + c1.width + " 와 "+ c1.height + "이다");
		
		System.out.println();
		System.out.println("c2는" + c2.kind+ ", "+ c2.Number + "이며");
		System.out.println("크기는 " + c2.width + " 와 "+ c2.height + "이다");
		System.out.println();
		
		//width와 height는 static 변수인데 클래스 Card.width와 Card.height를 
		//사용하지 않고 인스턴스 c1과 c2로 접근 했는데 이것도 무방하나 
		//인스턴스변수로 오해 할수 있으므로 사용권고 안함.
		
		c1.width = 50;
		c1.height = 80;
		//c1으로 static 변수를 정정하면 c2의 값도 변동
		System.out.println("c2의 static 변수 width 값 : " + c2.width );
		System.out.println("c2의 static 변수 height 값 : " + c2.height );
		System.out.println("c1의 static 변수 width 값 : " + c1.width );
		System.out.println("c1의 static 변수 height 값 : " + c1.height + "\n");
		
		Card.width = 120;
		Card.height = 119;
		System.out.println("c2의 static 변수 width 값 : " + c2.width );
		System.out.println("c2의 static 변수 height 값 : " + c2.height );
	}
	
}
class Card{
	
	//맴버변수 중 인스턴스 변수(객체를 생성해서  그 객체에 속하는 변수 -- 메모리의 heap 영역에 저장)
	//객체 사용이 끝나면 없어짐 
	
	String kind;
	int Number;
	
	//어느 객체도 사용할수 있는 공동 변수로 클래스 변수--static이 붙음
	//프로그램 종료시까지 지속 
	
	static int width = 100; // 클래스 로딩시 같이 로딩되므로 값도 줌(메모리의 메서드 영역에 저장)
	static int height= 250; 

	
}
