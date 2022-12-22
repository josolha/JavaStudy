package ch07;

public class Ex07_Final {

	public static void main(String[] args) {
		Card c = new Card("heart",12); // 생성자로 final 인스턴스 변수 KIND와 NUMBER초기화
//		c.KIND = "spade"; 초기화 이후에는 final 인스턴스변수는 변경 불가 
		
		System.out.println("KIND : " + c.KIND);
		System.out.println("NUMBER : " + c.NUMBER);
		
		System.out.println(c.toString());
	}

}

class Card{
	final int NUMBER;  
	//인스턴스 상수 (상수명은 대문자)는 선언시에 초기화 하나 생성자로 초기화를 할수 있다. 단 1회만 
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card() { // 기본형 생성자도 만들어 주는 습관을 기른다.
		this("heart", 10);
	}
	

	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	
	@Override //Object의 toString Override
	public String toString() {
		return " " + KIND + " " + NUMBER; 
	}
	
	
	
}