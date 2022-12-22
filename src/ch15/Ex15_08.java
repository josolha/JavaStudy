package ch15;

import java.io.FileInputStream;
import java.io.FileReader;

public class Ex15_08 {

	public static void main(String[] args) {
		try {
			String fileName = "ex1508.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			
			int data = 0;
			//FileInputStream�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
			System.out.println();
			System.out.println("====================");
			fis.close();
			
			//FileReader�� �̿��ؼ� ���ϳ����� �о� ȭ�鿡 ����Ѵ�.
			while((data=fr.read()) != -1) { //char����(2����Ʈ)�� ó��
				System.out.print((char)data);
			}
			System.out.println();
			fr.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
