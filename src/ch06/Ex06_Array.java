package ch06;

public class Ex06_Array {

	public static void main(String[] args) {
		
		Tv01[] tvArr = new Tv01[3];
		
		tvArr[0] = new Tv01();
		tvArr[1] = new Tv01();
		tvArr[2] = new Tv01();
		
		Tv01[] tvArr1 = new Tv01[]{new Tv01(),new Tv01(),new Tv01()};
		
		//만약에 100개다 하면 땀남.. 원소갯수가 많을 시는for 문 사용 
		Tv01[] tvArr2 = new Tv01[100];
		
		for (int i = 0; i < tvArr2.length; i++) {
			tvArr2[i] = new Tv01();
		}
		
	}

}
class Tv01 {
	
	// 클래스를 구성하는 멤버는 멤버변(속성)와 메서드(기능), 생성자
	// 멤버변수 
	String color; // 기본 값 null
	boolean power; //  false
	int channel; // 0 
	
	//멤버 메서드
	void power() {
		power = !power;
	}
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
}
	
	
