package ch06;

public class Ex06_06 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main () : x = " + d.x);
		
		change(d.x); //change 메서드 호출 
		System.out.println("After change (d.x) : = " + d.x);
		
		change2(d);
		System.out.println("last change (d.x) : = " + d.x);
		
		
	}
	static void change(int x) { // 기본형 파라메터 , 호출한 곳의 d.x 는 변경 안됨 
		x = 10000; // x는 로컬변수 
		

	}
	static void change2(Data d) {
		d.x = 1000;
	}
}


class Data{
	int x;
}