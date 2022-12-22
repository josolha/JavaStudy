package ch04;

import java.util.Iterator;

public class Ex04_07 {

	public static void main(String[] args) {
		
		int num = 0;
		
		for (int i = 0; i <=5 ; i++) {
			num = (int)(Math.random() * 6) + 1;
			//Math.random()�� double�� 0.0���� 0.9999999���� ����
			//Math.random()�� ���� ���ڸ� ���Ͽ� �� ���� ���ں��� 1���� ���� ���Ѵ�. 
			//num�� 0���� 6������ ����
			System.out.println(num);
			
			
			
			
		}
	}

}
