package ch02;

public class Ex02_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Ja"+"va"; // +�� ���ϱ� ������ �ƴϰ� ���ڿ��� �����ϴ� ���� ������
		String str = name + 8.0; 
		// ���ڿ� ������ �Ҽ��� ���ڸ� ����, ���ڿ��� ������ ���սô� ���ڸ� ���ڿ�ȭ�ؼ� ����
		System.out.println(name);
		System.out.println(str);
		System.out.println(str+ name);
		
		System.out.println(7+ 7 + ""); // 14 + "" --> "14" + "" -
		System.out.println(""+ 7 + 7); // ""+"7" --> "7" + 7 --> "7"+"7" -- "77"
		
		
	}

}
