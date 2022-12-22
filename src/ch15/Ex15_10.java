package ch15;


import java.io.*;

public class Ex15_10 {

	public static void main(String[] args) {
		String inputData = "ABCD";
		//StringReader�� ������ �Ķ���͸� ���ڿ��� ���(�޸��� ���ڿ� �迭�� ��ó�� ���)
		//���ڿ� ó���� StringReader�� StringWriterŬ������ ����Ͽ� ó��
		StringReader input = new StringReader(inputData);
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			while((data = input.read()) != -1) {
				output.write(data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Input Data : " + inputData);
		System.out.println("Output Data : " + output.toString());
	}

}
