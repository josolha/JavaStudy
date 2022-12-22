package ch04;

public class Ex04_quiz1 {

	public static void main(String[] args) {
		/*
		  1. 10 ���ϱ� 5 ����� ���
		  2. 10 ������ 5 ����� ���
		  3. int x�� �����ϰ� �ʱⰪ�� 10���� �Ѵ�.
		  4. x���� 1 �������� ���(���� ������ ���)
		  5. int y�� �����ϰ� �ʱⰪ�� 5�� �Ѵ�
		  6. x�� y�� ������ ���Ͽ� ���
  		  7. x�� y�� �ٸ��� ���Ͽ� ���
  		  8. ���ڿ� str1 �����ϰ� �ʱⰪ abcde
  		  9. str1�� null���� ���ϰ� ���
  		  10. str1�� xyz���� ���ϰ� ���
		 
		 */
		
		System.out.println(10*5); //1
		System.out.println(10/5); //2 
		int x = 10;     		  //3	
		x++;						
		System.out.println(x);    //4
		int y = 5;                //5
		System.out.println(x==y); //6
		System.out.println(x!=y); //7
		
		String str1 = "abcde";    //8
		String str2 = "abcde";
		
		System.out.println(str1.equals(null));  //9
		System.out.println(str1.equals("xyz")); //10 equals�� ���� ��
		System.out.println(str1 == str2);// �������� �񱳴� ==�� �ϸ� false�� ��
		// �������� �񱳴� == ���� �񱳰� �ƴ϶� ������ ��
		
	}

}
