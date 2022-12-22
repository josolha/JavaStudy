package ch06;

public class Ex06_08 {

	public static void main(String[] args) { // 클래스형 메서드 
		
		Data3 d = new Data3(); 
		// 메서드 안에서 만들므로 로칼 변수, Data3 클래스가 데이터형이므로 참조변수이고 객체(인스턴스)
		d.x = 10 ; // x는 인스턴스 변수이므로 클래스의 인스턴스(객체).변수로 접근  
		

		Data3 d2 = copy(d); //copy 메서드는 파라메터가 Data3객체이므로 인자값이 객체 
		//자기 클래스에 있는 static 메서드 호출시는 클래스 이름 필요 없음.
		//자기 클래스에 있는 인스턴스메서드는 자기 클래스 객체를 만들어서 객체.메서
		System.out.println("d.x : " +d.x);
		System.out.println("d2.x : " +d2.x);
		
	}
	
	static Data3 copy(Data3 d) { //리턴타입이 Data3형이고 매개변수도 Data3형
		Data3 tmp =  new Data3();
		tmp.x = d.x;
		return  tmp;
	}
	
	
}
class Data3{
	int x; // 인스턴스 맴버 int 변수 
}