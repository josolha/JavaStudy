package ch02;

public class Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "www.codechobo.com"; //������ ����
		float f1 = .10f; // double���� �ƴ� 4����Ʈ �Ǽ��� 0.10, 1.0e-1
		float f2 = 1e1F; // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.12345657; //�ڹٿ��� �Ҽ��� ���� �⺻�� double
		//������ 6�ڸ��ϰ� ����ϰ� 7��°���� �ݿø�
		System.out.printf("f1 = %f,%e,%g%n",f1,f1,f1); //%n�� �ٹٲ� ���๮��(\n���� ����)
		System.out.printf("f2 = %f,%e,%g%n",f2,f2,f2); 
		System.out.printf("f3 = %f,%e,%g%n",f3,f3,f3); 
		System.out.printf("d = %f%n",d);
		System.out.printf("d = %14.10f%n",d); // ��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		//�������κп����� 10�ڸ��� ä��� ���� ���� �κ��� 0���� ä��
		//���� �κ��� ���� �κ��� �����
		System.out.printf("[1234678901234567890]%n");
		System.out.printf("[%s]%n", url); //s�� ���ڿ� ����
		System.out.printf("[%20s]%n", url); //���ڸ��� 20�ڸ��� ���ڿ��� ����ϵ� ������ ����
		System.out.printf("[%-20s]%n", url); //�������� 
		System.out.printf("[%.8s]%n", url); // ���ʿ��� 8���ڸ� ���
		


	}

}
