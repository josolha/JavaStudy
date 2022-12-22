package ch04;

import java.util.Scanner;

public class Ex04_14 {

	public static void main(String[] args) {
			
		int num = 0, sum = 0;
		System.out.println("���ڸ� �Է��ϼ���. (��:12345)");
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine(); 
		
		num = Integer.parseInt(tmp);
		
		//Integer�� int�� ó���ϴ� Ŭ������ wrapper Ŭ�������Ѵ�(�⺻���� ���������� ��ȯ)
		
		//parseInt(tmp)�� tmp�� �������¸� ������ ��ȯ ����
		
		while(num !=0) {
			
			sum += num % 10;
			System.out.printf("sum= %3d num= %d%n",sum,num);
			num /= 10;
		}
		System.out.println("�� �ڸ����� ��"+sum);
		
		//��ø while ��
		int i = 2;
		while(i<=9) {
			int j = 1;
			while(j<=9) {
				System.out.println(i+ " * "+ j + " = " + i*j );
				j++;
			}
			i++;
			
		}
		
	}

}
