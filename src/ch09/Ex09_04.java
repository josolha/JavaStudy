package ch09;

public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card();
		Card c2 = new Card();
		

		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//참조변수형 객체를 출력시 객체이름만 사용하면 자동으로 toString()이 첨가되어 실행 
		System.out.println(c1);
		System.out.println(c2);
	}

}

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE",1);	
	}
	
	Card(String kind, int number1){
		super();
		this.kind = kind;
		this.number = number1;
		
	}
}
