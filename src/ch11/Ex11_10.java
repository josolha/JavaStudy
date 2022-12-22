package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		
		
		//로또 번호 발행시 중복된 번호를 피하기 위해 Set를 사용
		Set set = new HashSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45) +1;
			set.add(num);
		}
		
		List list = new LinkedList(set);
//		LinkedList의 생성자의 파라미터는 Collection이면 모두 가능  
		Collections.sort(list); // Collection의 sort는 파라미터로 List만 허용 
		System.out.println(list); 
		
		
		
		Iterator a = set.iterator();
		
		while(a.hasNext()) {
			System.out.println(a.next());
		}
	}

}
