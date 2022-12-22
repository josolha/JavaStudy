package ch05;

public class Ex05_06 {

	public static void main(String[] args) {
		String[] names = {"Kim", "park", "lee"}; // 선언과 동시에 초기화
		
		for(int i = 0; i < names.length ; i++) // 블록안의 문장이 한줄이면 {  } 생략 가능 
			System.out.println("names[" +i+"] : "+ names[i]);
		
		String tmp = names[2];
		System.out.println("tem :"+ tmp);
		
		names[0] = "Yu"; //첫번째 배열값을 yu로 변경 
		
		for(String str : names ) { //enhanced for문 배열원소 데이터형 변수명 : 배열명
			System.out.println(str);
		}
		
		String[] strArr = new String[3];
//		strArr = {"Kim", "park", "lee"}; 
//		직접 값 입력 방식은 선언시 초기화 할시만 가능
//		String[] strArr = new String[3]{"Kim", "park", "lee"} 는 가능
//		아래 처럼 초기화 함
		
		strArr[0] = "kim";
		strArr[1] = new String("ko");
		
		
		
		
		
		
		
		
		
	}

}
