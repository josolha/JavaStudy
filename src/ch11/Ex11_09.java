package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {

	public static void main(String[] args) {
		
		Integer i1 = 1;
		Object[] objArr = {"1",i1,"2","2","3","3","4","4","4"};
		
		Set set = new HashSet();
		
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); 
			// 중복된 값은 추가시 실패하고 false 반환 , 데이터 형이 다른 1은 다른것으로 간주 
		}
		
		System.out.println(set);// 
		
		// HashSet에 저장된 요소들을 출력한다. (Iterator 이용)
		Iterator it = set.iterator();
		
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
