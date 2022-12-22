package ch05;


public class Ex05_05 {

	public static void main(String[] args) {
		//로또 번호 1에서 45를 가지는 배열을 선언
		int[] ball = new int[45]; //배열 참조변수 선언(메모리 확보)
		
		//배열의 각원소에 값을 넣어줌
		for (int i = 0; i < ball.length; i++) { //i는 반복변수이면서 색인번호를 나타냄
			ball[i] = i + 1; // 각 원소에 들어가는 값은 색인번호보다 1만큼 큼			
		}
		int tmp =  0; // 임시 변수로 교환시 교환값 임시 저장
		int j = 0; //로또 번호로 추출할 색인 번호  
		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random() * 45); // 0에서 44까지의 임의의 수
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
			
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("ball[%d] = %d%n ", i, ball[i]);
		}
		System.out.println();
		
		Lotto Lotto123 = new Lotto();
	
	}

}

class Lotto{
	
	Lotto(){
	int[] ball = new int[45];
	
	for(int i = 0; i< ball.length; i++) {
		ball[i] = i+1;
	}
	int tmp = 0;
	int j = 0;
	
	for (int i = 0; i < 6; i++) {
		j = (int)(Math.random()*45);
		tmp = ball[i];
		ball[i] = ball[j];
		ball[j] = tmp;
	}
	for (int i = 0; i < 6; i++) {
		System.out.printf("ball [%d] =  %d%n",i,ball[i]);
	}
	}
}


