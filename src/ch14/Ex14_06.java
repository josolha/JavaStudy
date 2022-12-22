package ch14;

import java.io.File; //java.io 패키지(입출력)에 있는 File 처리 클래스
import java.util.stream.Stream;

//map 중간연산 메서드
public class Ex14_06 {

	public static void main(String[] args) {
		//<R> Stream<R> map(Function<? super T,? extends R> mapper) 
		//map은 파라미터 T를 처리하여 R형으로 변환 처리하는 메서드 
		File[] fileArr = {new File("Ex1.java"),new File("Ex1.bak"),
				new File("Ex1.bak"),new File("Ex1"),new File("Ex1.txt"),new File("Ex1.")};
		// File(String pathname)생성자는 파리미터로 파일의 경로명을 이용하여 파일 객체 만듬.
		Stream<File> fileStream = Stream.of(fileArr);
		// map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println);
		//최종연산으로 stream을 소모했으므로 없어짐
		fileStream = Stream.of(fileArr); //스트림을 다시 생성
		fileStream.map(File::getName)
		.filter(s->s.indexOf('.')!=-1) // .문자가 있는 문자열만 선택 
		.map(s->s.substring(s.indexOf('.')+1)) //.문자뒤의 색인번호부터 마지막까지 선택
	    .map(String::toUpperCase)            // 대문자로 변환
	    .distinct() // 중복 제거 		
	    .forEach(System.out::println);
		//map은 여러번 중간 연산 가능
		
		//중간 연산 peek()
		//-peek()중간연산메서드는 map()이나 filter()로 중간 연산된 결과를 확인 해볼시 사용(for each())등의
		// 최종 연산과 달리 결과를 소모하지 않는 중간연산이므로 필요시마다 확인해볼 수 있음 
		fileStream = Stream.of(fileArr); //스트림을 다시 생성
		fileStream.map(File::getName)
		.filter(s-> s.indexOf('.')!=-1)
		.peek(s->System.out.printf("filename=%s%n",s)) //peek중간중간 처리내용을 확인시에 사용
		.map(s->s.substring(s.indexOf('.')+1))
		.peek(s->System.out.printf("extension=%s%n",s))
	    .map(String::toUpperCase)            // 대문자로 변환
	    .distinct() // 중복 제거 		
		.forEach(System.out::println);
	}

}
