package ch04;

public class Ex04_12 {

	public static void main(String[] args) {
		
		int i =  5;
		
		while(i-- !=0) { //i--�� ��ó�� �İ����̹Ƿ� i�� 5���� �����ϳ� ��½ÿ��� 4�� ��
			System.out.println(i + " - I can do it.");
		}
		
		int sum = 0;
		int j = 0;
		while(sum <= 100) {
			System.out.printf("%d - %d%n", j,sum);
			sum += ++j;
		}
	}

}
