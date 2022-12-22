package ch15;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex15_14 {

	public static void main(String[] args) {
		
		PrintStream ps = null; // stream기반(표준 입출력을 대상)
		FileOutputStream fos = null; //대상이 File에 출력
		try {
			fos = new FileOutputStream("test1514.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); //ps가 file을 대상으로 하는 fos를 사용하므로 출력을 file에 해줌
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hello by System.out");
		System.err.println("Hello by System.err");
		//err의 Printstream을 변경하려면 setErr(fos)로 함 
	}

}
