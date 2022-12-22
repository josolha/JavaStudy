package ch06;

public class Ex06_11 {

	public static void main(String[] args) {
		
		Data1 d1 = new Data1();
		d1.value = 10;
		
		Data2 d2 = new Data2(10);
		
		Data2 d3 = new Data2();  //기본형은 없어지므로 에러가 발생하므로 만들어 사용 
		
		
		
		
	}

}


class Data1 {
	
	int value;
	//생성자가 명시적으로 하나도 없으므로 자바 컴파일러가 기본형 생성자
	
	//Data1(){ // 파라메터가 없고 구현부도 없는 생성자
	//	
	//}를 컴파일시 추가 해줌.
	
}


class Data2 {
	
	int value;
	
	Data2(int x){
		super(); //실제로는 상위 클래스의 생성자를 호출하는 명령이 들어가있다. 
		value = x; 
	}
	//파라메터를 하나 갖는 생성자를 명시적으로 작성하여 기본형은 없어짐.
	//기본형도 사용하려면 명시적으로 만들어줌. Data2(){}
	
	Data2(){
		super();
	}
	
}
