package ch07;

public interface Ex07_Inherit extends Movable, Attackable {
	//인터페이스 2개를 상속(인터페이스는 다중 상속 허용, 인터페이스간에만 상속 extends)
}

interface Movable{
	void move(int x, int y); //  public abstract이 생략된 추상 메서드
}


interface Attackable{
	void attack();
}

interface Fightable extends Movable, Attackable {
	// 추상 메서드 move, attack 을 가
}



class Fighter extends TestClass implements Fightable {
	
	//상송(extends)와 구현 (implements) 동시 가능 
	
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack() {
	 
		
	}
}
	


abstract class FighterABS implements Fightable{
	
	@Override
	public void move(int x, int y) {
		
	}

	@Override
	public void attack() {
	 
		
	}
	public abstract void defence();
	
}
class TestClass{
	int test;
}

