package ch07;

final class Singleton { // final 이므로 상속 금지 
	
	private static Singleton s = null;  // private 이므로 외부 클래스에서 접근 금지 
	
	private Singleton() {  // 생성자도 private 이므로 외부 접근 금지
		System.out.println("생성자 사용");
		
	}
	
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
			
		}
		
		return s;
	}

}

