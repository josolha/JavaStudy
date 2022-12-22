package ch11;

import java.io.FileOutputStream;
import java.util.Properties;

// Properties 는 프로그램의 환경 설정시에 많이 사용( Spring, SpringBoot등에서 설정 파일) 

public class Ex11_pt {
	

	public static void main(String[] args) {
		
		//HashTable을 이용하므로 Map 처럼 사용 
		//단 key와 value가 String, String 
		Properties prop = new Properties();
		prop.setProperty("timeout","30");
		prop.setProperty("language","한글");
		prop.setProperty("capacity","10");
		
		try {
			prop.store(new FileOutputStream("/Users/josolha/Desktop/eclipseFIleOut/output.txt"),"Properties Exam");
			prop.storeToXML(new FileOutputStream("/Users/josolha/Desktop/eclipseFIleOut/output.xml"),"Properties Exam");
			
		}catch(Exception e){
			e.printStackTrace();
	
		}
		
		System.out.println("Properties Test");
	}

}
