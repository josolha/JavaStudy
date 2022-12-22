package ch08;

import java.io.File;

public class Ex08_10 {

	public static void main(String[] args) {
		try {
			File f = createFile(args[0]);
			System.out.println(f.getName() + "파일 만들기 성공");
		}
		catch(Exception e){
			System.out.println(e.getMessage() + "다시 파일 이름 입력.");
		}
		
		
		
	}
	static File createFile(String fileName) throws Exception {
		if(fileName == null || fileName.equals("")){
			throw new Exception("파일 이름이 유효하지 않습니다.");
		}
		
		File f = new File(fileName); // 이름이 fileName 인 파일 객체를 만듬.
		// 실제 파일 만들기 
		f.createNewFile();
		
		return f; 
	}

}
