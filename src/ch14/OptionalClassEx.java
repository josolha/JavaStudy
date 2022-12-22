package ch14;

import java.util.Optional;

//Optional<T>클래스는 T타입의 스트림 객체를 만드는 wrapper 클래스이다.

public class OptionalClassEx {

	public static void main(String[] args) {
		//Optional<T>로 stream 객체 만들기
		String str = "abc";
		Optional<String> optVal = Optional.of(str);
		Optional<String> optVal01 = Optional.of("abc");
		Optional<String> optVal02 = Optional.of(new String("abc"));
		
		//null값을 갖는 Optional 객체
		//Optional<String> optValNull01 = Optional.of(null); // NullPointException 발생
		//ofNullable(null)을 사용하면 예외 발생 안함
		Optional<String> optValNull02 = Optional.ofNullable(null);
		
		//Optional 객체의 초기값은 null대신 empty()메서드로 초기화 한다.
		Optional<String> optValNull03 = null;
		Optional<String> optValNull04 = Optional.<String>empty();
		//empty는 <String> 지네릭 메서드임
		
		//Optional 객체의 값을 가져오기 
		Optional<String> optValGet1 = Optional.of("abc");
		
		String strGet1 =  optValGet1.get(); // abc 반환, null이면 예외
		String strGet2 =  optValGet1.orElse("");  //null일 경우 "" 을 반환, 값이 있으면 있는 값
		System.out.println("strget2: " + strGet2);
		
		String strGet3 = optValGet1.orElseGet(String::new); //생성자 참조 람다식을 사용 
		System.out.println("strget3: " + strGet3);
		
		String strGet4 = optValGet1.orElseThrow(NullPointerException::new);  
		// 생성자 참조 람다식을 사용 null일시는 NullPointerException 발생
		System.out.println("strget4: " + strGet4);
		
		
	}

}
