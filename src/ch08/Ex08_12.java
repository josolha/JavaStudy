package ch08;

public class Ex08_12 {
   
   public static void main(String[] args) {
      
      try {
         method1();
      } catch (Exception e) {
         System.out.println("main메소드에서 예외가 처리되었습니다.");
      }
      
      
   }
   
   static void method1() throws Exception{
      //일부는 자신이 try~catch로 처리하고 일부는 throws로 처리함  --->예외 되던지기
      try {
         throw new Exception();
      }
      catch (Exception e) {
         System.out.println("method1메소드에서 예외가 처리되었습니다.");
         throw e;   //다시 예외를 발생시킨다
		}
	}
}