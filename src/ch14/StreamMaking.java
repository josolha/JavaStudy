package ch14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamMaking {

	public static void main(String[] args) {
		//stream에 사용되는 데이터 소스는 Collect, 배열, 임의의 가변 데이터 등 
		//Collection 인터페이스에는 Stream<E> stream() 메서드가 있다 
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		intStream.forEach(System.out::println);
		//forEach(Consumer)는 intStream의 각원소에 대해 반복 처리
		//Stream1회용으로 사용하면 사라짐
		
		//배열, 가변인자로 부터 stream클래스의 static메서드인 of()를 사용하거나
		//Arrays의 static메서드인 stream()을 사용하여 stream 객체를 만듬
		Stream<String> strStream = Stream.of("a","b","c"); //가변 인자
		Stream<String> strStream1 = Stream.of(new String[] {"a","b","c"}); //배열 
		Stream<String> strStream2 = Arrays.stream(new String[]{"a","b","c"}); //배열
		Stream<String> strStream3 = Arrays.stream(new String[]{"a","b","c"}, 0, 3);
		//배열의 색인번호 0번부터 3-1까지 갖는 배열
		strStream3.forEach(System.out::println);
		
		//기본형을 위한 intStream,LongStream,DoubleStream을 얻는 메서드도 일반 stream 처럼
		//static 메서드인 of()와 stream()메서드를 갖는다.
		IntStream intStream1 = IntStream.of(1,2,3); //가변 인자
		IntStream intStream2 = IntStream.of(new int[] {1,2,3}); //배열 
		IntStream intStream3 = Arrays.stream(new int[] {1,2,3}); //배열
		IntStream intStream4 = Arrays.stream(new int[]{1,2,3}, 0, 3);
		
		intStream4.forEach(System.out::println);
		
		//범위값을 처리하는 기본형 stream 
		 IntStream intStream5 = IntStream.range(1, 5);       // 마지막수는 포함안함  1,2,3,4
		 IntStream intStream6 = IntStream.rangeClosed(1, 5); // 1,2,3,4,5
		 
		 //난수데이터 그룹을 소스로 하는 Stream 객체는 난수 처리 클래스인 Random 클래스로 처리
		 //정수 난수는 ints(), long형은 longs(), double형은 doubles()로 처리 
		 IntStream rdintStream = new Random().ints(); // 정수 무한 스트림
		 LongStream rdlongStream = new Random().longs(); //long형 무한 스트림
		 DoubleStream rddoubleStream = new Random().doubles(); //long형 무한 스트림
		 
		 //limit(size)는 크기를 size로 지정
		 rdintStream.limit(5).forEach(System.out::println);
		 /*
		 		Integer.MIN_VALUE <=  ints()  <= Integer.MAX_VALUE
     			Long.MIN_VALUE <=  longs() <= Long.MAX_VALUE
	            0.0 <= doubles() < 1.0
		 */
		 
		 //생성시에 크기를 지정하여 스트림 생성
		 IntStream rdintStream01 = new Random().ints(5);
		 System.out.println("====================");
		 rdintStream01.forEach(System.out::println);
	
		 /*
		  // 범위를 지정시에는 파라미터에 범위 지정 
		 IntStream    ints(int begin, int end)                    // 무한 스트림
		 LongStream   longs(long begin, long end)  
		 DoubleStream doubles(double begin, double end)
		
		 //크기도 지정
		 IntStream    ints(long streamSize, int begin, int end)   // 유한 스트림
		 LongStream   longs(long streamSize, long begin, long end)
		 DoubleStream doubles(long streamSize, double begin, double end)
		 */
		 
		 System.out.println("====================");
		 IntStream rdintStream02 = new Random().ints(5L,1,7); //7은 포함 
		 rdintStream02.forEach(System.out::println);
		 
//		 static <T> Stream<T> iterate(T seed,UnaryOperator<T> f) // 이전 요소에 종속적
//		 static <T> Stream<T> generate(Supplier<T> s)            // 이전 요소에 독립적 
		 
		 //iterate()와 generate()로 만든 stream은 기본형 스트림은 될수 없다.
		 System.out.println("====================");
		 Stream<Integer> evenStream   = Stream.iterate(0, n->n+2);  // 0,2,4,6, ...
		 //결과를 새로운 seed로 사용
		 evenStream.limit(6).forEach(System.out::println);
		 
		 Stream<Double>  randomStream = Stream.generate(Math::random);
		 Stream<Integer> oneStream    = Stream.generate(()->1);
		 
		 
		 String dir = "/Users/josolha/Desktop";
		 String file = "/Users/josolha/Desktop/ㅇㅇㅇ.html";
		 //Path.get(dir)로 path객체를 얻어냄
		 try {
			 Stream<Path> streamph = Files.list(Paths.get(dir)); 
			 streamph.forEach(System.out::println);
			 
			 //특정 파일의 라인별 데이터를 소스로하는 Stream반환
			 Stream<String> streamli = Files.lines(Paths.get(file));
			 streamli.forEach(System.out::println);
			 
			 //BufferedReader의 lines()메서드를 사용할 수도 있다.
			 //Stream streamBF = new BufferedReader().lines();
			 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 //빈 Stream	객체 만들기 null 보다는 이것을 사용함 
		 Stream emptyStream = Stream.empty();
		 Long count = emptyStream.count(); //원소개수 반환
		 System.out.println("원소개수 : " + count);
		
	}

}
