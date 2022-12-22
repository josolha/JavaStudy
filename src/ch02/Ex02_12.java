package ch02;

public class Ex02_12 {

	public static void main(String[] args) {
		String str = "3"; //����3�� �ƴ� ���ڿ� 3
		System.out.println(str.charAt(0) - '0');
		// charAt(int index) �޼���� String Ŭ������ ����, ���ι�ȣ�� 0�� ���� ����
		// '3' - '0'�� ���ڰ� ��Ÿ���� ��ȣ ���̷� 3
		System.out.println('3' - '0' + 1); //���� 3 + 1�̹Ƿ� ���� '4'
		System.out.println(Integer.parseInt("3") +1 );
		//parseInt (���������ڿ�)�� ���ڿ��� int�� ����
		System.out.println("3" +1); //���ڿ� + ���ڴ� ���ڿ� + ���������ڿ� "31"
		System.out.println(3 + '0'); // ����3�� ���� '0' �� ���ϸ�  '0'���� 3ū�� �� ���� '3'
		

	}

}
