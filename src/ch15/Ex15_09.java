package ch15;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex15_09 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1]);
			
			int data =0;
			while((data=fr.read()) != -1) {
				fw.write(data);
			}
			fr.close();
			fw.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
