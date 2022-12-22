package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//바이트 처리하는 InputStream이나 OutputStream을 문자로 처리하는 클래스
//자바 1.5부터 제공되는 입력스트림 처리는 Scanner클래스를 활용 

public class Ex15_12 {

	public static void main(String[] args) {
		String line = "";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			//InputStreamReader객체는 InputStream객체를 이용하여 만듬
			//System.in 변수는 키보드 입력 스트림을 나타내며 InputStream 데이터형
			BufferedReader br = new BufferedReader(isr);
			System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());
			
			do {
				System.out.println("문장을 입력하세요. 마치시려면 q를 입력하세요.> ");
				line =br.readLine();
				System.out.println("입력하신 문장 : " + line);
			}while(line.equalsIgnoreCase("q"));
			
			br.close(); //System.in 과 같은 표준 입출력은 닫지 않아도 된다.
			System.out.println("프로그램을 종료합니다.");
			
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
