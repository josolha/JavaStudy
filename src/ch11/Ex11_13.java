package ch11;

import java.util.Iterator;

import java.util.*;

public class Ex11_13 {

	public static void main(String[] args) {
		
		Set set = new TreeSet(); // set 인터페이스를 구현, 중복 허용 안함, 순서1 지정 안됨 
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //중복이 안됨 
		}
	}

}
