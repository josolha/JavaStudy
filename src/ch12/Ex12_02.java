package ch12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex12_02 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		//ArrayList의 참조변수 list는 Student 참조변수를 제네릭으로 사용 
		//ArrayList의 맴버(변수,메서드)중 제네릭을 사용하는 모든 것들을 Student를 제네릭으로 사용
		//대표적인 메서드 public boolean add(E e)도 제네릭 E를 사용하므로 여기서는 Student 사용 
		list.add(new Student("자바왕", 1,1));
		list.add(new Student("자바짱", 1,2));
		list.add(new Student("홍길동", 1,1));
		
		Iterator<Student> it = list.iterator();
		//Interface Iterator<E>
		while(it.hasNext()) {
			Student s = it.next();
			//E next()는 제네릭 E를 반환하도록 정의됬는데 대입된 타입파라미터가 Student 
			System.out.println(s.name);
		}
		
		HashMap<String,Student> map =new HashMap<String, Student>();
		//K는 String,V는 Studet으로 제네릭 대입 
		Student s0 = map.put("stu1",new Student("자바0",1,1));
		Student s1 = map.put("stu2",new Student("자바1",1,1));
		Student s2 = map.put("name",new Student("자바2",1,1));
		
		//public V get(Object key)
		Student sout = map.get("stu1");
		System.out.println(sout.name);
	
		
	}

}
class Student{
	String name = "";
	int ban; //초기값 0
	int no; //초기값 0
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
		
	}
}
