package ch07;

public class Ex07_01 {

	public static void main(String[] args) {
		
		//main 메서드는 주로 사용하려는 객체를 만들고 그객체의 메서드를 호출하여 사용
		SmartTv stv = new SmartTv();
		stv.channel = 10; // 원래 channel 맴버변수는 Tv 소속이나 상속받은 SmartTv도 가지므로 사용 가능 
		stv.channelUp(); // Tv의 메서드도 상속하였음으로 사용 가능
		System.out.println(stv.channel);
		stv.displayCation("Hello World");
		stv.caption = true;
		stv.displayCation("Hello World");
		
		SmartTv stv2 = new SmartTv();
		stv2.justTry();
		System.out.println(stv2.channel);
		int a =1;
		System.out.printf("hello %d" + "안",a );

	}

}
class Tv{
	
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv{ //TV 클래스를 상속 
	
	//smartTv는 Tv를 상속하므로 Tv의 멤버변수와 메서드를 상속
	//생성자와 초기화 블록은 상속 안됨!!
	boolean caption;
	int a =1;
	
	void displayCation(String text) {
		
		
		if(caption) {
			System.out.println(text);
		}
	}
	void justTry() {
		
		super.channel = 1;
		super.channel = a;
		
	}
	
}
