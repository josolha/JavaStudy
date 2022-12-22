package ch15;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex15_11 {

	public static void main(String[] args) {
		try {
			
			FileReader fr = new FileReader("ch15Project/Ex15_10.java"); //BufferReader를 사용하기 위한 기반 reader
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			for (int i = 1; (line = br.readLine()) != null; i++) {
				//readLine메서드는 BufferedReader의 메서드로 1줄씩 읽어옴
//				System.out.println(i + ":" +line);
				// ;으로 끝나는 실행문만 출력 
//				System.out.println("=======================");
				if(line.indexOf(";") !=1) {
					System.out.println(i+":"+line);
					
				}
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
