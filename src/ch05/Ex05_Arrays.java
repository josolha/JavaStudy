package ch05;

import java.util.Arrays;

public class Ex05_Arrays {

	public static void main(String[] args) {
		//배열을 문자열로 변환
		
		int[] arr = {0,1,2,3,4}; // 1차원 배열
		int[][] arr2D = {{11,12},{21,2}}; // 2차원 배열
		
		// 1차원 배열 문자열화는 Arrays.toString(1차원 배열명);
		System.out.println(Arrays.toString(arr)); // "[0,1,2,3,4]"
		
		// 2차원 배열 문자열화는 Arrays.deeptoString(2차원 배열명);
		System.out.println(Arrays.deepToString(arr2D)); // "[[11, 12], [21, 2]]"
		
		//1차원 배열 비교는 Arrays.equals(1차원 배열, 1차원 배열명)
		//2차원 배열 비교는 Arrays.deepequals(2차원 배열, 2차원 배열명)
		
		int[] arr1 = {0,1,2,3,4,5};
		int[][] arr2D1 = {{11,12},{21,2}};
		
		System.out.println("1차원 배열 비교 : " + Arrays.equals(arr,arr1));
		System.out.println("1차원 배열 비교 : " + Arrays.deepEquals(arr2D,arr2D1));
		
		//배열의 정렬은 Arrays.sort(배열명);
		int[] arr2 = {5,3,14,6,9,8};
		Arrays.sort(arr2); //sort() 메서드는 린턴값이 없고 자신을 정렬 
		System.out.println("배열 정렬" + Arrays.toString(arr2));
		
		//배열의 복사 
		//copyof는 지정된 숫자 만큼을 copyOfRange()는 배열의 구간을 지정해서 복사한 다른 배열을 만듬.
		int[] arr3= {5,6,7,8,9};
		int[] arr4= Arrays.copyOf(arr3,4);
		System.out.println("arr4 : " + Arrays.toString(arr4));
		
		int[] arr5= Arrays.copyOf(arr3,10);
		System.out.println("arr5 : " + Arrays.toString(arr5));
		// 기존 배열을 초과하는 원소는 배열의 데이터형의 기본값으로 채움(숫자는 0, 불리언은 false..)
		
		int[] arr6 = Arrays.copyOfRange(arr3,1,4);
		
		
		
	}

}
