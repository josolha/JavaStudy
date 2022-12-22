package ch09;

public class Ex09_01 {

	public static void main(String[] args) {
		
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		// v1과 v2는 다른 참조변수 객체로 주소는 틀리고 값은 같다. 
		
		
		//equals는 object 클래스의 equals를 사용 
		// Object의 equals this == obj를 비교, == 은 주소를 비교 
		// 참조변수가 다르면 무조건 false 
		
		/*
		 public boolean equals(Object obj){
		 	 return (this == obj);
		 }
		 */
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		}else {
			System.out.println("v1과 v2는 다르다");
		}
		
	}

}
class Value extends Object{  // object 생략 가능 
	int value; // 인스턴스형 맴버변수 
	
	Value(){
		super(); // 자동 호출되나 작성해주는 것잉 좋다. 
	}
	
	Value(int value){ // 생성자가 만들어져 기본형은 사용 불가 
		
		super(); // 자동 호출되나 작성해주는 것이 좋다.
		
		this.value = value;
	}
}