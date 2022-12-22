package ch15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Ex15_07 {

	public static void main(String[] args) {
	  byte[] arr1 = {0,1,2};
	  byte[] arr2 = {3,4,5};
	  byte[] arr3 = {6,7,8};
	  byte[] outSrc = null;
	  
	  Vector v = new Vector();
	  v.add(new ByteArrayInputStream(arr1)); 
	  //바이트배열을 src로 하는 ByteArrayInputStream 객체를 Vector의 원소로 추가 
	  v.add(new ByteArrayInputStream(arr2));
	  v.add(new ByteArrayInputStream(arr3));
	  
	  SequenceInputStream input = new SequenceInputStream(v.elements());
	  //Vector의 elements()메서드는 Enumeration 객체를 반환하고 Enumeration 객체의 원소는
	  //ByteArrayInputStream 객체로 구성됨
	  //input는 SequenceInputStream객체이므로 여러개의 기반스트림인 ByteArrayInputStream를
	  //하나의 스트림 처럼 연결하여 만듬
	  
	  ByteArrayOutputStream	output = new ByteArrayOutputStream();
	  
	  int data = 0;
	  
	  try {
		  
		  while((data = input.read())!=-1) { //read는 ASCII코드인 0~255과 -1을 반환 
			  output.write(data);
		  }
	  }
	  catch(Exception e){
		  e.printStackTrace();
		  
	  }
	  outSrc = output.toByteArray();
	  
	  //배열을 문자열 형식으로 반환하는 메서드는 Arrays의 static메서드인 toString()을 사용 
	  System.out.println("Input Source 1 :"+ Arrays.toString(arr1));
	  System.out.println("Input Source 2 :"+ Arrays.toString(arr2));
	  System.out.println("Input Source 3 :"+ Arrays.toString(arr3));
	  System.out.println("Output Sourc :"+ Arrays.toString(outSrc));
	  
	  //2개의 기반스트림객체를 파라미터로 하는 SequenceInputStream 객체를 만들어 사용
	  try {
		  FileInputStream file1 = new FileInputStream("file001.txt");
		  FileInputStream file2 = new FileInputStream("file002.txt");
		  SequenceInputStream input1 = new SequenceInputStream(file1,file2);
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  
	  

	}

}
