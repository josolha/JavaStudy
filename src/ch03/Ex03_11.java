package ch03;

public class Ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592;
		long piL = Math.round(pi); //round�޼���� ����� long������ ��ȯ(�Ҽ��� ù��°���� �ݿø��� ����)
		System.out.println("piL : " + piL);
		
		long first = Math.round(pi *1000); //3142
		double second = first / 1000.0; //long / double ---> double
		System.out.println("second : "+ second);
		
		double shortPi = Math.round(pi*1000)/ 1000.0;
		
		System.out.println("shortPi : "+ shortPi);
		

	}

}
