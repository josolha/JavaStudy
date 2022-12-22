package ch15;

import java.io.File;
import java.util.Iterator;

public class Ex15_16 {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("인자로 directory 경로를 적어 주세요");
			System.exit(0); //프로그램 종료
		}
		File f = new File(args[0]);
		
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리 입니다.");
			System.exit(0);
		}
		File[] files = f.listFiles(); //directory 밑에 있는 파일이나 directory 리스트를 배열로 반환
		
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			System.out.println(files[i].isDirectory() ? "["+ fileName+"]": fileName);
			//directory이면 [] 넣고 file이면 파일이름을 출력
		}
	}

}
