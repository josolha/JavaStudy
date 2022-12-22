package ch05;

import java.util.Arrays;

public class Ex05_02 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		float average = 0f;
		
		int[] score = {0,2,13,2,11}; //초기화를 값으로 함, 자동으로 크기가 5로 됨
		//int[] score = new int[]{100,88,100,100,90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
			
		}
		
		average = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		
		System.out.println("평균 : " + average);
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 0; i < score.length; i++) {
			
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
			
		}
		System.out.println("최댓값 : " +max);
		System.out.println("최솟값 : " +min);
		
		//second
		int max3 = 0;
		
		for (int i = 0; i < score.length; i++) {
			max3 = Math.max(max, score[i]);
		}
		System.out.println(max3);
		
		//third
		Arrays.sort(score);
		System.out.println(score[score.length-1]);
		
	}

}
