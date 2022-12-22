package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex11_08 {

	public static void main(String[] args) {
		Integer[] arr = {30,50,10,40,20};
		
		Arrays.sort(arr); //Integer가 구현한 Comparable의 compareTo 에 의해 정렬 
		
		System.out.println(Arrays.toString(arr));
		
		//Arrays.sort(arr, new DescComp());
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
		int max = max(1,2);
//		max2 = (int a,int b) -> return a > b ? a : b;
		
		

	}
	static int max(int a, int b) {
	
		return a >b ? a : b;
	}

}

class DescComp implements Comparator{
	
	public int compare(Object o1, Object o2) {
		if(!(o2 instanceof Integer && o2 instanceof Integer)){
			return -1;
		}
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		return i.compareTo(i2);
	}
}

