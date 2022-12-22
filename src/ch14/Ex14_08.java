package ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_08 {

	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length); //map으로 문자열의 크기로 변환
		System.out.println("optStr = "+optStr.get());
		System.out.println("optInt = "+optInt.get());
		
		int result1 = Optional.of("123")
		.filter(x->x.length() > 0) //문자열 존재시에만
		.map(Integer::parseInt).get(); //Integer.parseInt(문자열)로 정수로 변환
		
		System.out.println("result1="+ result1);
		
		OptionalInt optInt1 = OptionalInt.of(0);//정수형 Optional 객체인 OptionalInt에 0을 저장
		OptionalInt optInt2 = OptionalInt.empty(); // 빈 객체를 생성-값을 getAsInt()로 반환시 예외 발생
		
		System.out.println(optInt1.getAsInt()); // 0
		//System.out.println(optInt2.getAsInt()); //NoSuchElementException 예외 발생
		
		System.out.println("optInt1=" + optInt1);
		System.out.println("optInt2=" + optInt2);
		
		System.out.println("optInt1.equals(optInt2) = " + optInt1.equals(optInt2));
	}

}
