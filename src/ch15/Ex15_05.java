package ch15;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class Ex15_05 {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			//file을 대상으로 출력을 처리하는 기반 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			//new BufferedOutputStream(기반스트림객체, 버퍼 크기)
			//만일 버퍼크기가 없으면 기본인 8192바이트를 가짐 
			for (int i ='0'; i<='9'; i++) {
				bos.write(i); //버퍼를 이용하여 write하나 실제는 bos의 기반스트림인 fos인 출력을 담당
			}
			bos.close();
			//보조 스트림 객체를 close()하면 자동으로 기반스트림인 fos.close()도 수행하며 
			//flush()도 자동 실행되어 버퍼를 비워 준다.
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
