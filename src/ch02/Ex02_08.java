package ch02;

public class Ex02_08 {

	public static void main(String[] args) {
//		int x = 10;
//		int y = 5;
		int x = 10, y = 5;
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
		int tmp = x;
		x = y; // x�� y���� ���� -- x�� ������ 10���� ���Ե� y�� 5�� ���Ե�
		y = tmp;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);

	}

}
