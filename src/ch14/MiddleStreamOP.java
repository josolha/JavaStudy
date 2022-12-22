package ch14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

//Stream의 중간 연산 메서드 
public class MiddleStreamOP {

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1,10); //12345678910
		intStream.skip(3).limit(5).forEach(System.out::print); //45678
		//skip(3)은 스트림 원소의 3개를 건너뛰고 limit(5)는 스트림 원소의 5개만 선택
		
		System.out.println();
		
		IntStream intStream01 = IntStream.of(1,2,2,3,3,4,5,5,6);
		intStream01.distinct().forEach(System.out::print); //123456
		//distinct() 중간연산메서드는 중복된값을 처리  
		IntStream intStream02 = IntStream.rangeClosed(1,10); //1234567891
		intStream02.filter(i -> i%2==0).forEach(System.out::print); //246810
		//Stream<T> filter(Predicate<? super T> predicate) // 조건에 맞지 않는 요소 제거 
		//filter()는 파라메터가 Predicate형이므로 파라메터 1개를 받아 비교, 논리연산으로 true인것만 반환 
		
		IntStream intStream03 = IntStream.rangeClosed(1,10);
		//연산식이 비교연산과 논리 연산을 사용 
		intStream03.filter(i->i%2!=0 && i%3!=0).forEach(System.out::print);
//		intStream03.filter(i->i%2!=0).filter(i->i%3!=0).forEach(System.out::print);
		//filter를 연달아 사용 가능
		
		//sorted()중간처리 메서드
		System.out.println("====================");
		Stream<String> strStream = Stream.of("dd","aaa","CC","cc","b");
		strStream.sorted().forEach(System.out::println);
		 //sorted()는 Comparable을 사용하는 기본형 정렬(대문자가 소문자보다 빠름)
		
		
	}

}
