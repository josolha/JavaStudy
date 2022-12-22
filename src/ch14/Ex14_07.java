package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

//flatMap()을 사용하여 stream을 원소로 갖지 않고 일반 Stream 형태로 사용시에 활용

public class Ex14_07 {

	public static void main(String[] args) { // String 배열을 원소로 갖는 stream 객체
	  Stream<String[]> strArrStrm = Stream.of(
			  new String[] {"abc","def","ghi"},
			  new String[]{"ABC", "GHI", "JKLMN"});
	  Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
	  //flatMap()을 사용하면 일반 Stream적인객체를 만듬
	  
//	  Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
	  //map()을 사용하면 stream 객체를 원소로 갖는 stream 객체를 만듬
	  strStrm.map(String::toLowerCase)
	  	.distinct()
	  	.sorted()
	  	.forEach(System.out::println);
	  
	  String[] lineArr = {
		"Believe or not It is true",
		"Do or do not There is no try"
	  };
	  
	  Stream<String> lineStream =  Arrays.stream(lineArr);
	  lineStream.flatMap(line-> Stream.of(line.split(" +")))
	  //split()는 파라미터를 구분자로 해서 잘라서 배열 형식으로 반환  "공백+"에서 + 는 정규식 표현으로
	  // 하나이상의 공백을 구분자로 사용
	  .map(String::toLowerCase)
	  .distinct()
	  .sorted()
	  .forEach(System.out::println);
			 
	}

}
