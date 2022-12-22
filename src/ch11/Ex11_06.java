package ch11;

import java.util.Arrays;

public class Ex11_06 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5}; // 1차원 배열 
		int[][] arr2D = {{11,12,13},{21,22,23}}; // 2차원 배열 
		
		System.out.println("arr = " + Arrays.toString(arr));
		//Arrays.toString()의 파라미터는 기본형 배열, 참조형 배열 모두 사용 가능 
		System.out.println("Object의 toString() " + arr.toString());

		System.out.println("arr2D = " + Arrays.toString(arr2D));
		//주소를 출력 
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		//원소값을 출력 
		
		//copyOf는 1번째 파라미터의 배열을 2번째 파라미터로 지정한 크기로 복사하여 복사된 배열을 반환
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		int[] arr3 = Arrays.copyOf(arr, 3); //복사시에 앞에서 부터 복사
		int[] arr4 = Arrays.copyOf(arr, 7); // 복사할것이 없는 원소는 기본값으로 채움 
		//배열 원소의 범위를 지정시
		int[] arr5 = Arrays.copyOfRange(arr,2,4); // 2는 시작색인번호 4는 종료색인번호
		int[] arr6 = Arrays.copyOfRange(arr,0,7);
		
		System.out.println("arr2 = " + Arrays.toString(arr2));
		System.out.println("arr3 = " + Arrays.toString(arr3));
		System.out.println("arr4 = " + Arrays.toString(arr4));
		System.out.println("arr5 = " + Arrays.toString(arr5));
		System.out.println("arr6 = " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); // 1번째 파라미터 배열을 2번째 파라미터로 모두 채움 
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		Arrays.setAll(arr7, i -> (int)(Math.random()*6) +1);
		//setAll은 2번째 파라미터는 람다식의 값을 사용하여 채움 
		System.out.println("arr7 = " + Arrays.toString(arr7));
		
		for(int x : arr7) { // i는 arr7의 원소값 
			char[] graph = new char[x];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+x); //char배열은 문자열화 
		}
		String[][] str2D = new String[][] {{"aaa"},{"bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][] {{"aaa"},{"bbb"},{"AAA","BBB"}}; //	차원 값 비교
		// 2차원 배열 값 비교는 deepEquals로 한다.
		System.out.println(Arrays.equals(str2D,str2D2));
		System.out.println(Arrays.deepEquals(str2D,str2D2));
	
		char[] chArr = {'A','D','C','B','E'};
		
		System.out.println("chArr = "+ Arrays.toString(chArr));
		
		//binarySearch(chArr, 'B')는 chArr배열에서 2진 검색법으로 B를 찾아 색인번호 반환 
		//정렬후에 사용한다 
		System.out.println("index of B = "+Arrays.binarySearch(chArr, 'B'));
		System.out.println("=After sorting =");
		Arrays.sort(chArr); //파라미터 자신을 정렬(오름차순)
		System.out.println("chArr=" + Arrays.toString(chArr));
		
		System.out.println("index of B =" +Arrays.binarySearch(chArr, 'B'));
		
		/*
		char[] practice = {'1','2','3'};
		String a = new String(practice);
		System.out.println(a);
		*/
		char[] practice = {'1','2','3'};
		System.out.println(new String(practice));
		
		
	
	}

}
