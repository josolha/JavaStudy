package ch04;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {
		
		System.out.print("���� ���� �Է��ϼ���.>");
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		
		switch(month) { // ()���� ���ǰ��� ����� ������,���ڿ��� ���� ������ ���
			//case �ڿ� ���� ���� ������ ��� ��
			//��ó���� ���ǰ��� ��ġ�ϴ� case�� �̵�
			case 3: //�ڱ� case�ȿ� break���� ������ ��ó�� ������ break ���� ����
				
			case 4:
				
			case 5:
				System.out.println("3,4,5���� �� �Դϴ�.");
				break;
				
			case 6: case 7: case 8:
				System.out.println("6,7,8���� ���� �Դϴ�.");
				break;
				
			case 9: case 10: case 11:
				System.out.println("9,10,11���� ���� �Դϴ�.");
				break;
				
			case 12: case 1: case 2:
				System.out.println("12,1,2���� �ܿ� �Դϴ�.");
				break;
				
			default :
				System.out.println("�Է��� 1 ~ 12���̸� �ϼ���");
				
		}	
		System.out.println("switch�� �� �Դϴ�.");
	}

}
