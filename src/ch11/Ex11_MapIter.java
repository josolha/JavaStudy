package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_MapIter {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put("name","kook");
		map.put("age", 60);
		map.put("city", "seoul");
		map.put("hobby", "reading");
		
		Set eSet = map.entrySet(); // Set은 Collection이므로 iterator() 사용 
		Iterator it = eSet.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}
	}

}
