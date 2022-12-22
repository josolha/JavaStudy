package ch02;

import java.util.Scanner;
//java.lang ��Ű���� Ŭ������ �ƴ� Ŭ������ import �Ѵ�,�� ������ ��Ű���� ����.

public class Ex02_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� ������ �ϳ� �Է����ּ���->");
		
		String input = scanner.nextLine(); 
		// �Է½� ���� ���, �Է¹��� ������ ���ڿ��� ����, enter�� �ľ� �Է� �Ϸ�
		
		//������ ���ڿ��� ������ ����
		int num = Integer.parseInt(input);
//		String num2 = Integer.toString(num);
		System.out.println("�Է³��� :"+ input);
		System.out.printf("num = %d%n", num);
		
	
		

	}

}
