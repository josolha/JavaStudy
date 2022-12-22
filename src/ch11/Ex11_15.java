package ch11;

import java.util.TreeSet;

public class Ex11_15 {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet();
		
		int[] score = {80,95,50,35,45,65,10,100};
		
		for (int i = 0; i < score.length; i++) {
			set.add(score[i]); // 중복 안되거나 set에 대입  
		}
		System.out.println("50보다 작은 값 : " + set.headSet(50));
		//headSet(Object obj)로 반환은 SortedSet
		//기본형을 파라미터로 사용하면 autoboxing에 의해 기본형의 wrapper 클래스로 변경
		System.out.println("50보다 작은 값 : "+ set.tailSet(50));
		
	}

}
