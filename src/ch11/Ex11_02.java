package ch11;

import java.util.*;

public class Ex11_02 {

	public static void main(String[] args) {
		
		Stack st = new Stack(); // stack은 vector를 상속한 클래스 
		
		Queue q = new LinkedList(); //Queue는 인터페이스여서 이를 구현한 LinkedList 객체를 사용 
		
		st.push("0"); //push는 데이터를 stack에 저장 파라메터로 주로 객체형 사용 
		st.push("1"); // Object push(Objecrt obj) obj를 저장하 반환도 저장된 obj
		st.push("2");
		
		q.offer("0"); // boolean offer(Object obj) obj를 저장 결과는 성공 여부 
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		
		while(!st.empty()) { // Stack에 저장된것이 있는 경우 
			System.out.println(st.pop());
			//object pop()은 저장된 Object LIFO로 변환
			
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); // FIFO로 반환 (입력 순서)
			//Object poll()도 Object 반
		}
		
	}

}
