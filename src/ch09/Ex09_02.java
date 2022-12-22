package ch09;

public class Ex09_02 {
// object의 equals 메서드를 재정의 하는 경우 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(80110811112222L);
		Person p2 = new Person(80110811112222L);
		if(p1.equals(p2)) { 
			// p1 객체는 Person 객체이므로 equals도 Person것을 사용하므로 값을 비교 
			System.out.println("p1과 p2는 같은 사람입니다 ");
		}
		else {
			System.out.println("p1과 p2는 다른 사람입니다 ");
			
		}
		
	}

}
class Person extends Object {
	
	long id;
	
	Person(){
		super();
	}
	
	Person(long id){
		
		super();
		
		this.id  = id;
		
	}
	//Person은 Object를 상속 했음으로 Object의 메서드를 재정의 해서 사용 가능
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
			// 앞의 id는 맴버 변수 id이고 뒤의 id는 obj가 가진 id 
		}
		else
			return false;
	}
	public void test(Object obj) {
		String str = (String)obj; //상위클래스를 하위클래스 참조변수로 사용하려면 하위클래스로 형변환 
	}
	public void test1(String str) {
		String obj = str; // 하위클래스를 상위클래스 참조변수에 대입시는 형변환 필요없음  
	}
}
