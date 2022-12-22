package ch03;

public class Ex03_14 {

	public static void main(String[] args) {
		String str1 = "abc"; // ���������� Str�� ������ ������ ����
		String str2 = new String("abc"); // new�����ڿ� String �����ڸ� �̿��� �������� ����
		System.out.printf("\"abc\"==\" ? %b%n" , "abc" == "abc");
		//���������� Ű������ ��ȭ ǥ��
		//null�� �ƴ� ���ڿ��� �񱳽ÿ� ==�� ����ϸ� false�� ����
		System.out.println("str1�� abc? " + str1.equals("abc"));
		//equals()�޼���� ���� ������ true
		System.out.println("str1�� str2? " + str1.equals(str2));
		
		//��ҹ��� ���о��� ��
		String str3 = "ABC";
		System.out.println("str1�� str3 �� ? " + str1.equalsIgnoreCase(str2));
		//equalsIgnoreCase() ��ҹ��� ���о��� �� 
		
	}

}
