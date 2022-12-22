package ch11;

import java.util.ArrayList;
import java.util.Collections;

public class Ex11_01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		//현재 실습하는 ArrayList는 raw 타입 지양
		//ArrayList<String> list1 = new ArrayList<>(10);
		//public ArrayList(int initalCapacity) : 초기 용량 지정
		list1.add(new Integer(5)); // 9버전 부터 사용 지양 
//		list계열은 배열을 기반으로 하여 배열처럼 저장 
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		list1.add(5); // 중복 허용 
		
		ArrayList list2 = new ArrayList(list1.subList(1,4));
		//public List<E> subList(int fromIndex, int toindex);
		//생성자의 파라메터로 컬렉션 객체를 받을수 있다.
		print(list1,list2);
		
		System.out.println("list1.containsAll(list2): " + list1.containsAll(list2)); // list1은 list2 모두 포함하는가? 
		
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A"); // 색인번호 3번에 A추가 
		print(list1,list2);
		
		list2.set(3, "AA"); // set는 색인번호 3번을 변경 
		print(list1,list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다 반환은 boolean.
		System.out.println("list1.retainAll(list2): "+ list1.retainAll(list2));
		print(list1,list2);
		
		Collections.sort(list1);
		//Collection계열에게 유용한 메서드나 변수를 제공하는 클래스 Collections로 sort는 정렬 
		
		// list2에서 list1에 포함된 객체들을 삭제한다. 
		for (int i = list2.size()-1;  i >=0; i++) {
			//size()는 list의 원소개수 
			if(list1.contains(list2.get(i))) { //get(색인번호)는 색인번호의 원소 반환 
				list2.remove(i); // remove(원소번호)는 색인번호의 원소 삭제 
			}
			
		}
	
	
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : "+ list1);
		System.out.println("list2 : "+ list2);
		System.out.println();
	}

}
