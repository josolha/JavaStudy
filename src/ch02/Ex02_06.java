package ch02;

import java.util.Scanner;

public class Ex02_06 {
	
	static int xx;
	
	static int xy ;
	static int y;
	
	public static int get_xy() {
		return xy;
	}
	public static int get_y() {
		return y;
	}
	
	public static calculate[] calculateArrays = new calculate[10];

	public static void main(String[] args) {
		
		//�޼��� ���� ������ Ŭ�������� ��𼭳� ��� ����
		//�⺻���� �ʱⰪ�� ������ �ʱⰪ�� ���� ������ �⺻���� ��Ÿ��
		// TODO Auto-generated method stub
		int  x = 100; 	  // int�� ���� x�� �����ϰ� �ʱⰪ�� 100�� ����
		double pi = 3.14; // double�� ���� pi�� �����԰� ���ÿ� �ʱⰪ 3.14����
		char ch = 'a';    // char�� ���� ' '�ȿ� �ִ´�
		String str = "abc";    //�������� String Ŭ������ ������ �����ϰ� ���� �ʱ�ȭ
		// ���������� str���� abc�� ����Ȱ��� �ƴϰ� abc�� ����� ���� �ּҰ� �����.
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(xx);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x ���� �Է����ּ��� :");
		xy = sc.nextInt();
		
		System.out.println("y ���� �Է����ּ��� :");
		y = sc.nextInt();
		
		
		
	}
}

		
//class history{
	
//		static int xy;
//		static int y;
//		
//		
////		public history(int Ex02_06.get_xy(),int Ex02_06.get_y()){
//		
//			for (int i = 0; i < count; i++) {
//				Ex02_06.calculateArrays[i] = new calculate(Ex02_06.xy,Ex02_06.y);
//			}
//			count ++;
//			}
//	
//}
//		
class calculate{
	
	private int x;
	private int y;
	
	public calculate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void plus() {
		System.out.println(x+y);
	}
	public void minus() {
		System.out.println(x-y);
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
}
