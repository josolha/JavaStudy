package ch05;

public class Ex05_08 {

	public static void main(String[] args) {
			
		int[][] score = { // 배열 첨자[]이 두개 이므로 2차원 배열
				{100,100,100}, //0행 배열 , 안의 값들은 열 
				{20,20,20}, // 1행 배열 
				{30,30,30}, // 2행 배열 
				{40,40,40}, // 3행 배열 
		};
		
		/*
		 int[][] score = new int[][]{ // 배열 첨자[]이 두개 이므로 2차원 배열
				{100,100,100}, //0행 배열 , 안의 값들은 열 
				{20,20,20}, // 1행 배열 
				{30,30,30}, // 2행 배열 
				{40,40,40}, // 3행 배열 
		};
		 */
		int sum = 0;
		
		for (int i = 0; i < score.length; i++) { //배열 이름.length은 행의 개수
			for (int j = 0; j < score[i].length; j++) { // score[i].length는 열의 개수 
					System.out.printf("score[%d][%d] = %d%n",i,j,score[i][j]);
					sum += score[i][j];
			}
		}
		System.out.println("sum : " + sum);
		
	}

}
