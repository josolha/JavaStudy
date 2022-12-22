package ch07;

public class Ex07_07 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		
		
		car = fe;  // 부모 참조변수는 자신 참조변수를 사용(형변환 생략)
//		car.water(); 부모 자신한테 없고 자식이 만든 맴버는 부모는 사용 못함.
		
//		fe2 = car;
		fe2 = (FireEngine)car; // 부모를 자식 참조변수에 참조시는 강제 형변환 
		fe2.water();
		
		
		Car car1 = new Car();
		
		//instanceof는 자동 형변환이 되는 다형성일시는 true이나
		// 부모를 자식형 참조변수 대입시는 강제 형변환이므로 False가 나옴.
		if(fe instanceof FireEngine) {
			System.out.println("fe는 FireEngine 형입니다");
		}
		if(fe instanceof Car) {
			System.out.println("fe는 Car 형으로 형변환 가능합니다");
		}
		if(fe instanceof Object) {
			System.out.println("fe는 Object형으로 형변환 가능합니다");
		}
		if(car1 instanceof FireEngine) {
			System.out.println("Car는 FireEngine 형으로 형변환 가능합니다");
		}

	}

}

class Car{
	
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr");
	}
	
	void stop() {
		System.out.println("stop !!");
	}
	
}

class FireEngine extends Car{
	
	void water() {
		System.out.println("water");
	}
	
}