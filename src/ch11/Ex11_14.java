package ch11;

import java.util.SortedSet;
import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dise");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println("set의 원소수 : "+ set.size());
		System.out.println(set);
		//Set는 toString()이 재정의 됨 
		System.out.println("range search : from "+ from + " to " + to);
		SortedSet ss = set.subSet(from, to);
		//to는 포함이 안되고 바로 앞 객체 
		System.out.println(ss);
		
		SortedSet ss1 = set.subSet(from, to + "zzz"); //정렬 상태로 반환 	
		System.out.println(ss1);
		//대문자는 소문자 보다 빠름 대문자는 65부터 90, 소문자는 97부터 122까지. 
		
		
	}

}
