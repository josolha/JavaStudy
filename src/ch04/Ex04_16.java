package ch04;

public class Ex04_16 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while (true) {
			if(sum > 100)  // { } 안에 문장이 하나이면 {} 생략
				break; // 자기가 속한 반복문이나 switch를 빠져 나옴
			++i;
			sum += i;
		}
		System.out.println("i :" + i);
		System.out.println("sum : " + sum);
	}

}
