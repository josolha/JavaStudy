package ch14;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_05 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("조자바",1,300),
				new Student("솔자바",2,200),
				new Student("하자바",3,100),
				new Student("지자바",1,150),
				new Student("주자바",2,200),
				new Student("연자바",3,290),
				new Student("기자바",2,180)
				);
		studentStream.sorted(Comparator.comparing(Student::getBan) //ban을 기준으로 정렬 
		.thenComparing(Comparator.naturalOrder())) //Comparator.naturalOrder()는 기본 정렬- 오름차순
		.forEach(System.out::println);
		
		
	}

}
