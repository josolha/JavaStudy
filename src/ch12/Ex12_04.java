package ch12;

import java.util.ArrayList;

public class Ex12_04 {

	public static void main(String[] args) {
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		
		System.out.println(Juicer.makeJuice(appleBox));
		
	}

}

class Fruit2{ 
	public String toString() {
		return "fruit";
	}
}

class Apple2 extends Fruit2 {
	public String toString() {
		return "apple2";
	}
}

class Grape2 extends Fruit2 {
	public String toString() {
		return "grape2";
	}
}

class Box2 <T> { // 제네릭 클래스 
	
	ArrayList<T> list = new ArrayList<T>(); //list 생성기 T사용 
	
	void add(T item) { //인스턴스 메서드의 파라메터로 사용 
		list.add(item);
	}
	
	T get(int i) { //get의 리턴 타입으로 T사용 
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
	ArrayList<T> getList(){
		return list;
	}
}
class FruitBox2<T extends Fruit2> extends Box2<T>{
	// 제네릭 클래스를 상속한 클래스는 제네릭이어야함
	// 제네릭에서 extends로 제한을 줌(extends의 자신 포함 자손만 제네릭으로 사용)
	// super 사용시는 자신 포함 부모들만 제네릭으로 사용 
	// fruit가 eatable을 구현했고 이 fruit 상속한 것들은 Fruit & Eatable을 만족 
	// apple,grape,fruit가 제네릭으로 사용될수 있음 
}
class Juice{
	String name;
	Juice(String name){
		this.name = name + "Juice";
	}
	public String toString() {
		return name;
	}
}

class Juicer{
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		//메서드의 파라미터에 제네릭 타입 파라미터 기호가 아닌 실제 파라미터를 대입 
		//static메서드에서도 값이 결정되어 있어 사용 가능 
		//메서드에서 제네릭 사용시는 제약 조건으로 ?(와일드카드)를 사용 
		String tmp = "";
		for(Fruit2 f : box.getList()) {
			tmp += f + " ";
		}
		return new Juice(tmp);
	}
}