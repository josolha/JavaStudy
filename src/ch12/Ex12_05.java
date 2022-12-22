package ch12;

public class Ex12_05 {

	public static void main(String[] args) {
		
		
		//enum형 참조변수 선언은 클래스 처럼 해줌 , enum명 참조변수 이름 
		//값은 class의 static 맴버 처럼 enum이름.상수 이름으로 접근 
		//enum의 참조변수는 enum의 상수를 갖게 된다 
		Direction d1 = Direction.EAST; //값이 0
		Direction d2 = Direction.valueOf("WEST"); //1
		//valueof(문자열)은 enum의 최상의 객체인 Enum클래스가 제공하는 메서드, 반환은 enum 객체 
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		
		//enum의 컴파일도 클래스와 이름을 사용
		
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		
		System.out.println("d1==d2 ? " + (d1==d2)); // 참조형 변수는 equals로 비교하나 enum은  == 사용 
		//enum은 동등비교시 == 사용 가능(값 비교)
		System.out.println("d1==d3 ? " + (d1==d3));
		System.out.println("d1.equals(d2) ? " + (d1.equals(d3)));
//		System.out.println("d2 > d3 ? " + (d1 > d3)); // 비교 연산자는 사용 불가 
		
		//compareTo는 사용 가능 앞객체-뒷객체 (0,-,+)
		//compareTo는 enum 상수의 값을 비교  
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
			case EAST: // switch case문에 사용시는 상수 이름만 사용(enum이름.상수로는 사용 불가) 
				System.out.println("The direction is EAST.");
				break;
			case SOUTH:
				System.out.println("The direction is SOUTH.");
				break;
			case WEST:
				System.out.println("The direction is WEST.");
				break;	
			case NORTH:
				System.out.println("The direction is NORTH.");
				break;
			default :	
				System.out.println("Invalid diretion.");
				break;
		}
		Direction[] dArr = Direction.values(); //  enum의 상수들을 enum 배열로 반환 
		
//		for (int i = 0; i < dArr.length; i++) {
//			System.out.println(dArr[i]);
//		}
		for(Direction d : dArr) {
			//name과 ordinal 메서드는 최상위 클래스 Enum이 제공하는 메서드 
			//ordinal()은 숫자값 반환 
			//인스턴스 메서드로 참조변수로 접근 (values 와 valueof는 static 처럼  enum이름으로 접근)
			System.out.println("상수이름 : "+ d.name());
			System.out.println("상수 : "+ d.ordinal());
		}
		
	}

}
//enum
enum Direction {
	
	//enum은 상수들의 집합이므로 이름을 모두 대문자로 작성하낟 . 
	//문장 마지막의 세미클론(;) 없다. 
	//값은 자동으로 0부터 1씩 증가하여 각각의 상수에 주어짐. 
	
	EAST, SOUTH, WEST, NORTH
	
}