package ch07;

public class Ex07_10 {

	public static void main(String[] args) {
		Unit[] group = {new Marine(),new Tank(),new Dropship()};
		// Unit 배열은 자신을 상속한 클래스의 객체를 원소로 가질수 있다 
		// 다형성은 추상클래스에도 적용 
		// 추상클래스는 자기 자신으로는 객체를 못만드나 참조변수로 선언하고 자신을 구현한
		// 하위 클래스의 객체를 대입할수 있다.
		for(Unit u : group) {
			u.move(100,200);
			//move  메서드는 Unit의 move가 아니고 구현한 Marine,Tank,Dropship
			//move 메서드를 호출 
		}
//		Marine m = new Marine();
//		m.stimPack();
		
	}

}

abstract class Unit{ // 추상메서드가 있으므로 추상 클래스 
	int x,y;
	
	void stop() {
		System.out.println("Stop!!");
	}
	abstract void move(int x, int y);  // 추상메서드 
}

class Marine extends Unit{  // 추상 클래스 상속도 extends를 사용 
	
	// 추상메서드를 이 클래스에 맞게 구현 
	@Override
	void move(int x, int y) {
		System.out.println("Marine[x =" + x + ",y=" + y + "]");
	}
	
	void stimPack() {
		System.out.println("stimpack");
	}

}
class Tank extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Tank[x =" + x + ",y=" + y + "]");
	}
	void changeMode() {
		System.out.println("changeMode");
	}
}
class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x =" + x + ",y=" + y + "]");
	}
	void load() {/* 선택된 대상을 태운다 */}
	void unload() {/* 선택된 대상을 내린다 */}
	
}
