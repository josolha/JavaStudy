package ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {
	
	static String[] cars = new String[]{"volvo","Bmw","Ford"};


	public static void main(String[] args) {
		
		/*
        1. int x= 50; int y = 10인데 x가 y보다 큰 경우를 비교하는 조건문을 만들고 true라고 출력
        2. x가 y와 같은지를 비교하는 조건문을 만든다
        3. x와 y가 같은지를 비교하는 조건문과 그외의 경우를 처리하는 조건문을 만든다
        4. x와 y가 같은지 x가 y보다 큰지 아니면 기타 조건인지를 만들자
        5. int time=20
           time이 18보다 적으면 goodday를 선택하고 아니면 goodevening을 선택해서 result에 저장하는 삼항 연산식을 작성
		*/
		
		//1
		int x = 50;
		int y = 10;
		
		if(x > y) {
			System.out.println("true");
		}else if(x == y){
			System.out.println("same");
		}else{
			System.out.println("false");
		}
		
		
		//2
		int time = 20;
		
		String result = "";
		
		if(time < 18) {
			result += "goodday";
		}else {
			result += "goodevening";
		}
		System.out.println(result);
		
		//2-1 (3항 연산자)
		
		result = time < 18 ? "goodday" : "goodevening";
		
		System.out.println(result);
		
		//3 
		int day = 2;
		
		switch(2){
			case 1:
				System.out.println("Saturday");
				break;
			case 2:
				System.out.println("Sunday");
				break;
				
		}
		//4
		int i = 5;
		
		while(i>0) {
			System.out.print(i+" ");
			i--;
		}
		System.out.println();
		
		//5
		int sum = 0;
		
		for (int j = 0; j <= 100; j++) {
			sum += j;
		}
		System.out.println(sum);
		
		//6
		String[] cars = new String[]{"volvo","Bmw","Ford"};
		
		//7
		cars[2] = "hyundai";
		System.out.println(Arrays.toString(cars));
		
		//1.원하는 자리수를 선택    2. 바꿀 내용 입
		
		
		//11
		System.out.println(cars.length);
		
		choose ch = new choose();
		
	}

}
class choose{	
	
	int number;
	String change;

	choose(){
		
		System.out.println("원하는 자리수를 선택 : ");
		Scanner sc = new Scanner(System.in);
		this.number = sc.nextInt();
		
		System.out.println("바꿀내용 입력하세요 : ");
		this.change = sc.next();
		
//		print pt = new print();
//		pt.print(number-1,change);
		
		String[] cars = new String[]{"volvo","Bmw","Ford"};
		practic_choose(cars);
			
		}
	
	void practic_choose(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if(number == i) {
				arr[i] = change;
			}
		}
		show(arr);
	
	}
	
	void show(String[] arr) {
		
		System.out.println(Arrays.toString(arr));
		
	}
}


//class print{
//	
//	String print(int number, String change){
//		String[] cars = new String[]{"volvo","Bmw","Ford"};
//
//		for (int i = 0; i < cars.length; i++) {
//			if(i==number) {
//				cars[i] = "hyundai";
//			}
//		}
//		System.out.println(Arrays.toString(cars));
//		return Arrays.toString(cars);
//	}
//	
	
//}
		
