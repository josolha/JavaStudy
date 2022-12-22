package ch03;

public class Ex03_17 {

	public static void main(String[] args) {
		int x,y,z; // ���������� ���� ������ ���ٿ� ����
		int absX, absY, absZ; // ���밪���� ����ϴ� ����
		char signX, signY, signZ;
		
		
		x = 10 ;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		//���ǿ����ڴ� �񱳿���� �Ǵ� ������� ? true�� �� : false�� ��
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		
		signX = x > 0 ? '+' : (x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : (y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : (z==0 ? ' ' : '-');
		
		System.out.println("signX : " + signX + " absX : " + absX);
		System.out.println("signY : " + signY + " absY : " + absY);
		System.out.println("signZ : " + signZ + " absZ : " + absZ);
	}

}
