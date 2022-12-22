package ch04;

import java.util.Scanner;

public class Ex04_05 {
	
	

	public static void main(String[] args) {
		int score = 0; //local ������ ����� �⺻���� �ʱ�ȭ �ϴ� �� �ǰ� ( ���ڴ� 0)
		String grade = " "; //char���� �����̽� ' ' �� �ʱ�ȭ
		
		System.out.println("������ �Է����ּ���.>");
		
		Scanner sc = new Scanner(System.in);
		
		score = sc.nextInt();
		
		System.out.printf("����� ������ %d�� �Դϴ� %n",score);
		
		if(score >= 90) {
			grade = "A";
			if(score >= 98) { //if ������ if������ ����(��÷) if��
				//grade = grade + "+";
				grade += "+"; //���մ����� �ǰ�
			}
			else if(score < 94) { 
				grade += "-";
			}
		}
		else if(score >= 80) {
			grade = "B";
			if(score >= 88) {
				//grade = grade + "+";
				grade += "+"; //���մ����� �ǰ�
			}
			else if(score < 84) { 
				grade += "-";
			}
		}
		else { // score  < 80 
			grade = "C";

		}
		System.out.println("����� ������: " + grade + " �Դϴ�.");
	}

}
