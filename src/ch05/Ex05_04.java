package ch05;

import java.util.Arrays;

public class Ex05_04 {

	public static void main(String[] args) {
		
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(numArr));
		
		for (int i = 0; i < 100; i++) {
			
			int n = (int)(Math.random()*10); // 0 ~ 9 까지의 색인번호 생성  
			
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		
	}

}
