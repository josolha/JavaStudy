package ch09;

public class Ex09_05 {

	public static void main(String[] args) {
		
		Card1 c1 = new Card1();
		Card1 c2 = new Card1();
		

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//toString() 생략 가능 
		System.out.println(c1);
		System.out.println(c2);
	}

}

class Card1{
	String kind;
	int number;
	
	Card1(){
		this("SPADE",1);	
	}
	
	Card1(String kind, int number1){
		super();
		this.kind = kind;
		this.number = number1;
		
	}
	@Override
	// 객체의 멤버 변수값를 출력 
	public String toString() {
		return "kind : " + kind + ", number : " + number; 
	}
}