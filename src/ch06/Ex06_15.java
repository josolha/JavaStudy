package ch06;

import java.util.Arrays;
import java.util.Iterator;

public class Ex06_15 {
	
	static int[] arr = new int[10]; //클래스 변수 int 배열 arr
	
	// 배열의 초기화를 클래스 로딩시 만듬
	static {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10)+ 1; // 1부터 10사이의 수 
			//배열의 초기화 
		}
	}
	
	public static void main(String[] args) {
		for(int x :  arr) {
			System.out.println(x);
		}
		
//		System.out.println(Arrays.toString(usestatic.arr2));
		
//		usestatic us = new usestatic(1);
	
		
		
		
		
	}

}


//class usestatic {
//	
//	static int[] arr2 = new int[10];
//	
//	static{
//		for (int i = 0; i < arr2.length; i++) {
//			   arr2[i] = i;
//		}
//	}
//	
//	{int a= 10;
//	System.out.println("a");}
//	
//	public usestatic(int a){
//		
//		 System.out.println(a);
//			
//		}
//	}




