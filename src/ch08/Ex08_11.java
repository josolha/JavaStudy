package ch08;

public class Ex08_11 {
   
   
   public static void main (String[] args) {
	  
      try {
         startInstall(); // 메서드 정의시에 throws 예외명으로 되어 있어 이 예외명의 에외처리를 해줘야함 
         copyFiles();
      }
      catch(SpaceException se) {
          System.out.println("에러 메시지 : " + se.getMessage());
          se.printStackTrace();
          System.gc();    //Garbage Collection을 수행하여 메모리를 늘려준다.
          System.out.println("공간을 확보후 다시 설치를 해 주세요");
      }
      catch(MemoryException me) {
         System.out.println("에러 메시지 : " + me.getMessage());
         me.printStackTrace();
         System.gc();    //Garbage Collection을 수행하여 메모리를 늘려준다.
         System.out.println("다시 설치를 해 주세요");
      }
      finally {
         deleteTempFiles();
      }
      
   }
   static void startInstall() throws SpaceException, MemoryException { // 이 메서드 사용시는 무조건 예외 처리 
	   
	   if(!enoughSpace()) {
		   throw new SpaceException("설치할 공간이 부족합니다."); 
	   }
	   if(!enoughMemory()) {
		   throw new MemoryException("메모리가 부족합니다.");
		   
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


class SpaceException extends Exception {   // 예외처리를 필수로 해야하는 Exception을 상속했으므로 자식 클래스도 무조건 예외 처리를 함  
   //JDK의 예외 클래스 Exception을 상속하는 개발자가 만드는 예외 클래스
   SpaceException (String msg) {
      super(msg);   //Exception클래스의 문자열을 파라메터로 사용하는 생성자 호출 
   }
   
}
class MemoryException extends Exception {
   
   MemoryException(String msg) {
      super(msg);
   }
}