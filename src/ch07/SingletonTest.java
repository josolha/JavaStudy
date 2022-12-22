package ch07;

public class SingletonTest {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance(); //getInstance()는 public 이므로 접근 가
		
//		Singleton s1 = new Singleton(); 생성자가 private이므로 생성자 사용 못함.
//		Singleton s2 = Singleton.s; 맴버변수가 private 이므로 접근 불가.

	}

}
