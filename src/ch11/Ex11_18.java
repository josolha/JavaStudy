package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_18 {

	public static void main(String[] args) {
		
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		
		HashMap map = new HashMap();
		
		for (int i = 0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]); 
				//get(object key)는 키의 쌍에 해당하는 값 
				map.put(data[i], value+1); // 원래의 키에 대한 값이 1 증가 
			}
			else {
				map.put(data[i], 1);
			}
		}
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			// Map에서 변환된 iterator에서 map의 key와 value는 Map.Entry에 있음. 
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			String key = (String)entry.getKey();
			System.out.println(key + " : " + printBar('#',value) + " "+ value);
		}
		System.out.println("======================");
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {	
			System.out.println(key + " : "+ printBar('#', (int)map.get(key)) + map.get(key));	
		}
	}
	
	static String printBar(char ch, int value) {
		
		char[] bar = new char[value];
		
		for (int i = 0; i < bar.length; i++) {
			bar[i] = ch;
		}
		return new String(bar);
	}

}
