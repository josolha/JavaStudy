package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_02 {

	public static void main(String[] args) {
		
		Supplier<Integer> s;  
		// 리턴값이 있고 파라니터를 안가지는 인터페이스
		// Integer get();
		s = () -> (int)(Math.random() * 100) + 1;
		// public T get( ) {(int)(Math.random() * 100) +1;}
		
//		System.out.println(s.get());
		
		Consumer<Integer> c = i -> System.out.print(i+",");
		//파라미터 1개만 가지고 리턴 안함 void accept(T t)
		
		Predicate<Integer> p = i -> i%2 ==0;
		//파라미터 1개만 가지고 return boolean으로 
		//boolean test(T t)
		
		Function<Integer,Integer> f = i -> i/10*10; // 1의 자리를 버리는 수식 	
		
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s, list);
		
		System.out.println("생성한 랜덤 리스트 : "+list);
		
		printEventNum(p,c,list);
		
		List<Integer> newlist = doSomething(f,list);
		
		System.out.println("일의 자리수 버림 : "+newlist);
		
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		//리턴타입 앞 제네릭 메서드 <T>를 선언해서 파라메터의 지네릭을 T로 일반적으로 사용
		
		for (int i = 0; i < 10; i++) {
			list.add(s.get());
		}
	}
	
	static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("생성된 리스트 짝수 : "+"[");
		
		for(T i : list) {
			if(p.test(i)) {
				c.accept(i);
			}
		}
		System.out.print("]"+"\n");
	}
	
	static <T> List<T> doSomething(Function<T,T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size());
		for(T i : list) {
			newList.add(f.apply(i));
		}
		return newList;
		}

}
