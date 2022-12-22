package ch03;

import java.util.Scanner;

public class Ex03_15 {

	public static void main(String[] args) {
		//Scanner�� Ŭ������ Ű���� �Է��� ó���ϴ� Ŭ����
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("���ڸ� �ϳ� �Է��ϼ���");
		
		String input = scanner.nextLine();
		//nextLine()�� �����Է��� ���ͽñ��� ����ϴٰ� ���͸� ġ�� �Է��� ����� ��ȯ
		//nextLine()�޼���� ����� String���� ��ȯ
		
		ch = input.charAt(0); // ���ڿ� input���� 0(��ó��)�� ���ڸ� ��ȯ 
		
		if('0' <= ch && ch <= '9') {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		else if(('a'<= ch&& ch <= 'z')||('A' <= ch && 'Z'<= ch)){
			System.out.println("�Է��Ͻ� ���ڴ� �������Դϴ�. ");
			
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ� �����ڵ� �ƴϰ� ���ڵ� �ƴմϴ�..");
		}

	}

}
