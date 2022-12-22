package ch04;

public class Ex04_02 {

	public static void main(String[] args) {
		int x = 0;
		if(x ==0 ) {
			System.out.println("x==0");
		}
		if(x!=0) { //!= �� �� ����
			System.out.println("x!=0");
		}
		if(!(x==0)){
			System.out.println("1(x==0)");
		}
		
		x =1;
		
		if(!(x!=0)){ //!=�� �񱳿���
			System.out.println("x!=0");
		}
		if(!(x==0)){
			System.out.println("x==0");
		}
		if(!(x!=0)){
			System.out.println("x!=0");
		}
	}
}
