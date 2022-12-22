package ch07;

import java.util.ArrayList;

public class Ex07_17 {
	Object iv = new Object() {  // 익명의 클래스 
		void method() {
			
		}
	};
	
	static Object cv = new Object() { // 익명의 클래스 
		void method() {
			
		}
	};
	void myMethod() {
		Object lv = new Object(){ // 메서드 안에서 로칼 참조 변수로 직접 만듬.
			void methode() {
				
			}
		
		};
	}
}
