package ch14;

import java.util.function.Predicate;

public class Ex14_03 {

	public static void main(String[] args) {
//			ArrayList<Integer> list = new ArrayList<>();
//			for (int i = 0; i < 10; i++) {
//				list.add(i);
//			}
		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate();
		//negate()메서드는 not 연산 결과의 predicate 객체 반환 메서드 
		
		Predicate<Integer> all = notP.and(q.or(r));
		//and(), or()는 두개의 predicate객체를 and,or연산
		
		//연산의 결과는 test()로 얻어냄
		System.out.println(all.test(150));
		
		String str1 ="abc";
		String str2 ="abc";
		String str3 ="abd";
		
		//str1과 str2가 같은지 비교한 결과를 반환 
		//동등비교할 목적의 Predicate 객체를 만들시는 static 메서드인 isEqual(비교할 객체)
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		
		
		System.out.println(result);
		

	}

}
