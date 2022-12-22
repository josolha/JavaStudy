package ch14;

public class Ex14_01 {

	public static void main(String[] args) {
		
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> {
			System.out.println("f1.run()");
		};
		/*  단축형
		   MyFunction f1 = () -> System.out.println("f1.run()");  
		 */
		
		//익명의 객체 사용법 
		MyFunction f2 = new MyFunction(){
			
			@Override
			public void run() {
				System.out.println("f2.run()");
			}
		};
		
		// DI 활용 ? 
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(()-> System.out.println("run()")); // 람다식으로 파라미터 직접 만듬.

		
	}

	static MyFunction getMyFunction() { // 	리턴타입을 함수형 인스턴스를객체를 사용 
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	static void execute(MyFunction f) { // 파라메터를 함수형 인터페이스객체를 사용 
		f.run();
	}
	

}

//함수형 인터페이스(functional interface)는 추상메서드를 하나만 갖는 인터페이스
//람다식을 참조하는 참조형 변수로 사용. 


@FunctionalInterface  //함수형 인터페이스 인가를 체크  
interface  MyFunction{
	public abstract void run(); // 단축형으로 public abstract 생략 가능 
	//인터페이스라서 추상메서드 인줄 알기 때문에.
}
