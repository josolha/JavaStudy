package ch06;

//import ch06project.Tv;

public class Ex06_02 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1의 주소 " + t1);
		System.out.println("t2의 주소 " + t2);
		
		t1.channel = 7;
		
		System.out.println("t1의 채널  " + t1.channel);
		System.out.println("t2의 채널  " + t2.channel);
		
		t2 = t1; //t1의 주소값이 t2의 주소값으로 대입 
		System.out.println("t1의 주소 " + t1);
		System.out.println("t2의 주소 " + t2);
		
		System.out.println("t1의 주소" + t1.channel);
		System.out.println("t2의 주소" + t2.channel);
		
//		Tv.name();
//		System.out.println(Tv.channel12);
//		Tv.channel12  = 10;
//		System.out.println(Tv.channel12);
	
	}

}
