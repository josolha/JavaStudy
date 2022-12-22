package ch09;

import java.util.StringJoiner;

public class Ex09_09 {

	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		//animals = "dog-cat-bear"; 로 변경
		//문자열을 배열로 변경 
		String[] arr = animals.split(","); //,를 구분자로 하여 배열 생성 
		// 배열 arr을 문자열로 변경시 구분자를  - 로 사용 
		animals = String.join("-", arr); // arr 배열을 -로 구분하여 문자열로 변경 
		System.out.println("animals : " + animals);
		
		//StringJoiner 객체를 만들어 add메서드로 배열의 원소를 생성시 설정한 구분자와 
		//접두사,접미사를 첨가 
		StringJoiner sj = new StringJoiner("/","[","]");
		// /는 구분자, [은 접두사, ]은 점미사 
		
		for(String s : arr) {
			sj.add(s);
		}
		System.out.println(sj.toString());
		
	
		
	}

}
