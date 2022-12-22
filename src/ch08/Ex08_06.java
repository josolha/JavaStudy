package ch08;

public class Ex08_06 {

	public static void main(String[] args) {
		try {
			Exception e= new Exception("고의로 발생 시킴");
			// 예외 객체 생성시 해당 예외 객체 관련 정보를 문자열로 만듬. 
			throw e ; // throw는 에외를 던지는 키워드 
			//throw new Exception("고의로 발생 시킴"); // 두문장을 하나로 
		}
		catch(Exception e) {
			System.out.println("에러메세지  : " + e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("try ~ catch 블록 밖 ");
	}

}
