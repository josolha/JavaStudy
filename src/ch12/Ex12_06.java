package ch12;

public class Ex12_06 {

	public static void main(String[] args) {
		
		for(Direction2 d : Direction2.values()) {
			System.out.printf("%s=%d %s%n",d.name(),d.getValue(),d.getSymbol());
			
		}
		Direction2 d1 = Direction2.EAST;
		Direction2 d2 = Direction2.of(1); //색인번호 0번의 배열 원소 EAST 
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
		
		System.out.println(Direction2.EAST.rotate(1));
		System.out.println(Direction2.EAST.rotate(2));
		System.out.println(Direction2.EAST.rotate(-1));
		System.out.println(Direction2.EAST.rotate(-2));
		
	}
}

enum Direction2 {
	//상수의 값을 별도로 부여시는 () 안에 부여한다 (여기서는 2개값을 줌)
	//상수값 열거후에 ;(세미콜론)을 사용 
	//생성자와 두개의 값을 나타내는 인스턴스 변수를 선언 
	//값을 파라메터로 갖는 생성자를 선언 
	
	EAST(1,">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	
	private final int value; // 상수의 앞의 값
	private final String symbol; // 상수의 뒤의 값 
	private static final Direction2[] DIR_ARR = Direction2.values();
	
	
	//클래스의 생성자와 동일하나 묵시적으로 private 
	Direction2(int value, String symbol){
		this.value = value;
		this.symbol = symbol;
	}
	
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	
	public static Direction2 of(int dir) {
		if(dir < 1|| dir >4) {
			throw new IllegalArgumentException("Invaild value : " + dir);
		}
		return DIR_ARR[dir -1];
	}
	public Direction2 rotate(int num) {
		
		num = num % 4;
		
		if(num < 0){
			num += 4;
		}
		return DIR_ARR[(value-1+num) %4];
	}
	public String toString() {
		return name()+getSymbol(); // enum 객체를 print시 출력 형식 
	}
}
