package ch03;

public class Ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1_000_000; // 1,000,000 ó�� �ڸ��� ���н� _�� ����
		int b = 2_000_000; // 2,000,000
		
		long c = a*b; // a*b = // 2,000,000,000,000
		
		//a*b �� int * int = int �̾���ϴ� ������� int�� ����(21��)�� �ʰ��Ͽ� ������ ���� ����
		
		System.out.println(c);
	}

}
