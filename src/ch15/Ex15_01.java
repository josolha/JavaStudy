package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_01 {

	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; //byte 배열 이므로 -128 ~127
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		//ByteArrayInputStream은 상위 클래스인 InputStream을 상속한 메모리에 바이트배열로 입력 스트림
		
		ByteArrayOutputStream output = null;
		//ByteArrayOutputStream은 상위 클래스인 OutputStream을 상속한 메모리에 바이트 배열로 출력한는 출력 스트림
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream(); //32바이트 용량의 배열
		
		int data = 0;
		
		while((data = input.read())!=-1) {
			//input은 바이트 배열을 소스로 갖는 입력 스트림 ByteArrayInputStream이다
			//read메서드는 스트림으로 부터 읽어오는 값을 반환하는 메서드 -1은 값을 가져올수 없을시 반환
			output.write(data); 
		}
		
		outSrc = output.toByteArray(); //Stream에 있는 값을 byte 배열로 반환
		
		System.out.println("input source : " + Arrays.toString(inSrc));
		System.out.println("output source : " + Arrays.toString(outSrc));
		
		
	}

}
