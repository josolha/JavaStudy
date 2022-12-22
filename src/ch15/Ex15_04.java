package ch15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileInputStream과 FileOutStream은 파일을 대상으로 입출력 처리
public class Ex15_04 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(args[0]);
		//java.io.FileInputStream.FileInPutStream(String name) throws FileNotFoundException
		//파일이 없으면 예외 발생
		
		FileOutputStream fos = new FileOutputStream(args[1]);
		//FileOutputStream은 파일 생성시 파일이 없으면 새로 만듬
		
		int data = 0;
		
		while((data = fis.read()) != -1) {
			char c = (char)data;
			System.out.println(c);
			fos.write(data);  //FileOutputStream을 이용하여 출력 대상 파일에 write
		}
		fis.close();
		fos.close();
	}

}
