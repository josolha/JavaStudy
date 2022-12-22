package ch07;

public interface Ex07_interface1 {
	// 인터페이스는 상수만 정의 가능 public static final, 상수는 이름이 모두 대문
	public static final int SPADE = 1;
	public static final int DIAMOND = 2;
	
	
	// 인터페이스는 추상메서드만 가능
	public abstract String getCarNumber();
	// 인터페이스에서는 모든 메서드가 추상 public abstract 이므로 생략 가능
	String getCardKind();
	// 구현시(오버라이딩)는 빠진 public을 포함.

}
