package ch11;



import static java.util.Collections.*;

import java.util.*;

public class Ex11_19 {
	//메서드 앞에 Collections 생략 

	public static void main(String[] args) {
		
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list,1,2,3,4,5); //list객체에 뒤의 파라메터값을 모두 add 
		System.out.println(list);
		
		
		rotate(list,1); //오른쪽으로 두 칸씩 이동  뒤의 것이 앞으로 
		System.out.println(list);
		
		swap(list,0,2); // 첫 번째와 세번째를 교환(swap)
		System.out.println(list);
		
		shuffle(list); // 저장된 요소의 위치를 임의로 변경
		System.out.println(list);
		
		sort(list,reverseOrder()); // 역순 정렬 reverse(list); 와 동일 
		System.out.println(list);
		
		sort(list); // 정렬 
		System.out.println(list);
		
		int idx = binarySearch(list,3); //3이 저장된 위치(index)를 반환, 정렬후 사용   
		System.out.println("index of 3= " + idx);
		
		System.out.println("max =" +max(list));
		System.out.println("max =" +min(list));
		
		System.out.println("min = "+ max(list, reverseOrder()));
		
		fill(list,9); // list를 9로 채운다.
		System.out.println("list= "+list);
		
		//list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경불가
		List newList = nCopies(list.size(),2);
		System.out.println("newList =" + newList);
		
		System.out.println(disjoint(list,newList));  //공통요솧가 없으면 true
		
		copy(list,newList); //newList값을 list에 복사
		System.out.println("newList =" + newList);
		System.out.println("list ="+list);
		
		replaceAll(list,2,1); //list에서 2를 1로 교체 
		System.out.println("list="+list);
		
		Enumeration e = enumeration(list);  //list 객체를 반복 접근 가증한 Enumeration으로 반환
		ArrayList list2 = list(e);
		System.out.println("list2="+list2);
		
		/*
		 컬랙션객체 synchronized콜렉션이름(컬렉션객체)는 파라미터의 컬렉션을 동기화된 컬렉션으로 반환 
		 */

		
	}

}
