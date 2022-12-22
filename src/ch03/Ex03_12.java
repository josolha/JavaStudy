package ch03;

public class Ex03_12 {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;
		
		int r = x%y; //r�� ������ ���ѱ� ���� %�� ��
		int mok = x / y;
		
		System.out.printf("%d�� %d�� ������, %n", x,y);
		System.out.printf("���� %d �̰� ,�������� %d �Դϴ�. %n",x/y,x%y);
		System.out.println(0.1 == 0.1f); // �Ҽ��� �̸����� ������ false
		System.out.println(10.0 == 10.0f); //true
		
	}

}

/* 
 
 quiz1
 	1. Ŭ���� �̸��� Myclass �� Ŭ������ ����
 	2. Myclass�ȿ� main�޼��带 ����
 	3. main�޼���ȿ� hello�� �ܼ�â�� ��� �ϵ��� ��
 	4. ���� 1000�� ����ϵ��� �ϼ���
 	5. main �޼��� �ȿ��� ����� ���������� �����
 	   4����Ʈ ���� ���� myNum�� ����� �ʱⰪ�� 5
 	   4����Ʈ �Ǽ� ���� myFloatNum�� ����� �ʱⰪ�� 5.99
 	   2����Ʈ ���� ���� myLetter�� ����� �ʱⰪ�� D
 	   ���� ������ myBool�� ����� �ʱⰪ�� true
 	   ���ڿ��� ���� mytext�� ����� �ʱⰪ�� I love you
 */


