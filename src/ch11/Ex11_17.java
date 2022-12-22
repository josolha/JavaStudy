package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("김자바",90);
		map.put("김자바",100); // 앞의 김자바는 중복되어 사라
		map.put("이자바",100);
		map.put("강자바",80);
		map.put("안자바",90);
		
		//Map은 원소에 접근하는 iterator를 못가짐
		//Set으로 변환뒤 Set에서 Iterator를 만
		Set set = map.entrySet(); //map을 set으로 변환 
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			HashMap.Entry e = (HashMap.Entry)it.next();
			System.out.println("이름(key) : " + e.getKey());
			System.out.println("점수(value) : " + e.getValue());
		}
		
		set = map.keySet(); //map의 key들을 set으로 반환 
		
		for(Object str : set ) {
			String key = (String)str;
			System.out.print(key);
			System.out.print(map.get(key));
		}
		
		Collection values = map.values();
		it = values.iterator();
		
		int total =0;
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ (float)total/map.size());
		System.out.println("최고점수 : "+ Collections.max(values));
		System.out.println("최저점수 : "+ Collections.min(values));
		
		
//		for (int i = 0; i < map.size(); i++) {
//			map[i].getkey();
//		}
		
	}

}
