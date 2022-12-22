package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex15_02 {

	public static void main(String[] args) {
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9}; //읽어올 바이트 배열
		byte[] outSrc = null; // 출력할 바이트 배열
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp,0,temp.length); 
		//input 스트림을 이용하여 input스트림에 연결된 소스(바이트 배열)에서 바이트 단위로 읽어오는 값을 배열
		//배열 temp의 색인번호 0번 부터 temp.length개를 저장
		
		output.write(temp,5,5); //temp 배열에 있는 값을 색인번호 5번부터 5개를 가져와  output스트림에 넣어줌
		outSrc = output.toByteArray();
		
		System.out.println("input Source  :" + Arrays.toString(inSrc));
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("output Source :" + Arrays.toString(outSrc));
	
	}

}
