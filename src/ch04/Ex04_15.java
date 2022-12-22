package ch04;

import java.util.Scanner;

public class Ex04_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~ 100������ �� 
		
		System.out.println("answer : " + answer);
		
		Scanner sc = new Scanner(System.in);
		
		do { //������ ��Ͼ����� ��
			System.out.println("1�� 100������ ������ �Է��ϼ���.>");
			input = sc.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
				
			}else if(input < answer ){
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input != answer);
	}
}

