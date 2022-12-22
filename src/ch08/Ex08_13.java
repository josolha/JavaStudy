package ch08;

public class Ex08_13 {

	public static void main(String[] args) {
		try {
			install(); //  InstallException 예외처리 해야하는 메서드 
			
		}
		catch(InstallException e) {
		e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	static void install() throws InstallException{ // install 메서드를 사용하는 예외 처리 
		try {
			startInstall();
		}
		catch(SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e); //원인 제공 예외로 등록 
			//initCause(원인예외객체)sms 예외의 최상위인 Throwable이 제공 
			throw ie;
		}
		catch(MemoryException2 e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e); //원인 제공 예외로 등록 
			//initCause(원인예외객체)sms 예외의 최상위인 Throwable이 제공 
			throw ie;
		}
		finally {
			
		}
	}
	
	 static void startInstall() throws SpaceException2, MemoryException2 { 
		 // 이 메서드 사용시는 무조건 예외 처리 
		   if(!enoughSpace()) {
			   throw new SpaceException2("설치할 공간이 부족합니다."); 
		   }
		   if(!enoughMemory()) {
			   throw new MemoryException2("메모리가 부족합니다.");
			   
		   }
	      
	   }
	   static void copyFiles() {
	      //파일들을 복사하는 코드를 적는다.
	      
	   }
	   static void deleteTempFiles() {
	      
	   }
	   static boolean enoughSpace() {
	      return false;
	   }
	   static boolean enoughMemory() {
		  return true;
		   }

}
class SpaceException2 extends Exception {
	SpaceException2(String msg){
		super(msg);
	}
}
class MemoryException2 extends Exception {
	MemoryException2(String msg){
		super(msg);
	}
}

//위의 두개의 사용자 정의 예외 클래스가 원인이 되어 발생하는 예외 
class InstallException extends Exception{
	InstallException(String msg){
		super(msg);
	}
}