package ch12;

import java.util.ArrayList;

public class Ex12_03 {

	public static void main(String[] args) {
		
		FruitBox<Fruit> fruitbox= new FruitBox<Fruit>();
		FruitBox<Apple> applebox= new FruitBox<Apple>(); //Fruit 후손 이므로 가능 	
		FruitBox<Grape> grapebox= new FruitBox<Grape>();
//		FruitBox<Grape> grapebox= new FruitBox<Apple>(); //에러.타입 불일치 
//		FruitBox<Toy> grapebox= new FruitBox<Toy>();  // Fruit 후손이 아니므로 에러.
		//후손은 다형성으로 가능 
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		applebox.add(new Apple());
		//appleBox.add(new Grape()); //에러. Grape는 Apple의 자손이 아님 
		grapebox.add(new Grape());
		
		System.out.println("fruitBox-"+ fruitbox);
		System.out.println("appleBox-"+ applebox);
		System.out.println("grapeBox-"+ grapebox);
	}

}

class Fruit implements Eatable{ 
	public String toString() {
		return "fruit";
	}
}

interface Eatable{
	
}

class Apple extends Fruit {
	public String toString() {
		return "apple";
	}
}

class Grape extends Fruit {
	public String toString() {
		return "grape";
	}
}

class Toy{
	public String toString() {
		return "toy";
	}
}

class Box <T> { // 제네릭 클래스 
	
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
}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{
	// 제네릭 클래스를 상속한 클래스는 제네릭이어야함
	// 제네릭에서 extends로 제한을 줌(extends의 자신 포함 자손만 제네릭으로 사용)
	// super 사용시는 자신 포함 부모들만 제네릭으로 사용 
	// fruit가 eatable을 구현했고 이 fruit 상속한 것들은 Fruit & Eatable을 만족 
	// apple,grape,fruit가 제네릭으로 사용될수 있음 
	
}

