package ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



//@Deprecated
@SuppressWarnings("1111") // 유호하지 않은 에너테이션은 무시된다 .
@TestInfo(testedBy= "aaa",testDate = @DateTime(yymmdd="160101",hhmmss="235959"))

public class Ex12_08 {
	
	public static void main(String[] args) {
		
		Class<Ex12_08> cls = Ex12_08.class; // 클래스 객체는 컴파일된 클래스 파일 
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() =" +anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) {
			System.out.println("testTools ="+str); //자바는 Junit사용 
		System.out.println();
		
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
		}
		
	}
}
@Retention(RetentionPolicy.RUNTIME) //실행 시에 사용가능하도록 지
@interface TestInfo{ // 어노테이션 만들기 	
	//요소들(추상메서드 만듬, 요소이름은 메서드 이름
	int 			count()  		default 1;
	String 			testedBy();
	String[] 		testTools() 	default "JUnit";
	TestType 		testType() 		default TestType.FIRST; //enum 사용 
	DateTime 		testDate(); // 인터페이스 사용 
}
enum TestType{
	FIRST, FINAL
}
@interface DateTime{
	String yymmdd();
	String hhmmss();
}