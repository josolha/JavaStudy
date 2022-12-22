package ch06;

public class Ex06_14 {
	
	// 클래스형 블록으로 클래스 로딩시에 실행
	static {
		System.out.println("static{}"); // 메인이 실행 안되도 됌.
	}
	
	//인스턴스 블록(생성자 호출시 먼저 실행)
	{ 
		System.out.println("{ 성헌이 집으로 도망감}");
	}
	
	public Ex06_14(){
		System.out.println("생성자");
	}

	public static void main(String[] args) {
		
		System.out.println("Ex06_14 bt = new Ex06_14();");
		
		Ex06_14 bt = new Ex06_14(); //생성자 실행이므로 먼저 인스턴스 블록{ } 실행.
		
		System.out.println("Ex06_14 bt1 = new Ex06_14();");
		
		Ex06_14 bt1 = new Ex06_14(); //생성자 실행이므로 먼저 인스턴스 블록{ } 실행.
		
		
	}

}
