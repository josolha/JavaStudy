package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		
		//add 시 equals와 hashcode를 호출 
		set.add(new Person("David",10)); // 두개의 객체이므로 주소가 틀림 
		set.add(new Person("David",10));
		
		//값으로 비교하려 equals 와 hashCode메서드를 재정의함  
		
		System.out.println(set);
		
		
	}

}

class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ":" +age;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false;
		Person p = (Person)obj;
		return name.equals(p.name) && age== p.age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	
}
