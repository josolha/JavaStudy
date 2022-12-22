package ch06;

public class Ex06_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		// 오버로딩 된 메서드는 호출시 인자값의 데이터형 
		System.out.println(mm.add(3,3));
		System.out.println(mm.add(3,3L));
		System.out.println(mm.add(3L,3));
		System.out.println(mm.add(3L,3L));
		
		int[] a = {1,2,3};
		System.out.println(mm.add(a));
	}

}
class MyMath3{
	//전부 인스턴스형 메서드
	
	//메서드 오버로딩 
	//메서드 이름은 같고 파라메터의 갯수가 다르거나 파라메터의 데이형이 다른 메서드들.
	int add(int a, int b) { //개수는 2개 데이터형은 두개 모두 int.
		return a+b;
	}
	
	long add(int a, long b) { //파라메터 개수는 2개이나 b의 데이터형이 다름.
		return a+b;
	}
	
	long add(long a, int b) { //파라메터 개수는 2개이나 a의 데이터형이 다름.
		return a+b;
	}
	
	long add(long a, long b) { //파라메터 개수는 2개이나 데이터형이 모두 long.
		return a+b;
	}
	int add(int[]a) { //데이터형이 배열형
		
		int answer = 0;
		
		for(int x : a) 
			System.out.println(x); //for문안의 문장이 하나이면 {}생략 가능
		
//		for (int i = 0; i < a.length; i++) {
//		    System.out.println(a[i]);  
//		answer += a[i];
//	}
		
		return a.length;
//		return answer;
	}
	
}