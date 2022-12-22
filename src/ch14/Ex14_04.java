package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Ex14_04 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
			
		}
		// list의 모든 요소를 출력
		list.forEach(i -> System.out.println(i+","));
		//public void forEach(Consumer<? super E> action)
	    //forEach 메서드는 list 객체의 모든 요소를 반복하여 추출함 
		//파라메터로 람다식을 사용
		
		System.out.println();
		
		list.removeIf(x -> x%2==0 || x%3==0);
		//boolean removeIf(Predicate<? super E> filter) {
		//removeIf는 파라메터의 Predicate 결과 true 이면 해당 요소를 제거 
		System.out.println(list);
		
		Map<String, String>map = new HashMap<>();
		//Map<K,V>
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		
		//map의 모든 오소를 {k,v} 의 형식으로 출력한다.
		map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
		//void java.util.Map.forEach(BiConsumer<? super K, ? super V> action)
	}

}
