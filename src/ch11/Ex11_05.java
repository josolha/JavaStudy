package ch11;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_05 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		//<String>은 list의 원소는 문자열이어야만 됨 .
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		

	}

}
