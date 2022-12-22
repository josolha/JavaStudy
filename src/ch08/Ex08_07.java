package ch08;

public class Ex08_07 {

	public static void main(String[] args) {
//		throw new Exception(); 예외처리를 안하면 컴파일 에러가 발생하는 checked 예외
		throw new RuntimeException();
		//예외처리를 안해도 되는 unchecked예외
		//주로 runtime 계열, 예외 처리를 해주면 좋은데 사례가 너무 많아서 처리가 곤란. 
	}

}
