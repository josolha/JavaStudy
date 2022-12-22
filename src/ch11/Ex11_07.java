package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex11_07 {

	public static void main(String[] args) {
		
		String[] strArr = {"cat","Dog","lion","tiger"};
		
		Arrays.sort(strArr);
		//String의 정렬 기준은 Comparable 인터페이스를 구현(compareTo()메서드를 정의)
		System.out.println("strArr=" + Arrays.toString(strArr)); // 정렬
		//String은 오름차순으로 정렬(코드번호를 기준으로 번호가 작은것에서 큰것으로 정렬 
		//대문자가 소문자 보다 빠름 
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		//CASE_INSENSITIVE_ORDER 상수는 대소문자 안가리고 String에서
		//Comparator 인터페이스의 대소문자 무시 상수를 사용함
		System.out.println("strArr=" +Arrays.toString(strArr));
		
		Arrays.sort(strArr,new Descending());
		//sort시에 Descending 클래스가 정한 기준을 따름.
		
		System.out.println("strArr =" + Arrays.toString(strArr));
		
		Arrays.sort(strArr,new Comparator<String>(){  // 익명객체 사용 오름차순  
			
			@Override
			public int compare(String o1,String o2) {
				return o1.compareTo(o2);
				
			}
		});
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}

}
class Descending implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			// Comparable 인터페이스를 구현한 클래스의 객체 여야 비교토록 함 
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			
			//o1과 o2는 String이고 String은 Comparable의 compareTo가 있음. 
			return c1.compareTo(c2) * -1; // 역정렬(내림차순) 
		}
		return -1;
	}
	
}
