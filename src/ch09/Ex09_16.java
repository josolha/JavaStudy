package ch09;

import java.util.ArrayList;

public class Ex09_16 {

	public static void main(String[] args) {
		int i  = 10;
		
		Integer intg = (Integer)i; // 오토박싱 적용 이전, 기본형도 참조형으로 형변환
		Object obj = (Object)i; // 
		
		Long lng = 100L; // 기본형을 클래스객체형으로 바로 대입 (자동 박싱)
		
		int int2 = intg + 10; //객체형 + 기본형, 객체형에 intValue()가 자동 첨부
		//계산을 위해 객체형이 기본형으로 자동 변환 -- 자동 언박싱 
		
		long l = intg + lng; //참조형간의 연산도 가능 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//Integer를 원소로 갖는 list 
		list.add(10); // Integer 대신 int를 넣어도 자동 박싱이 되어 문제 없다. 
		list.add(intg);
					
		int res = list.get(0); //Integer로 저장된 값을 int로 변환(오토언박싱)
		Integer res1 = list.get(1);
		
		
	}

}
