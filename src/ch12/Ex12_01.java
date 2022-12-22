package ch12;

import java.util.ArrayList;
import java.util.List;

public class Ex12_01 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		//ArrayList<E>로 정의된 제네릭 클래스 임 
		//ArrayList<E>를 사용시 (호출시) 실제 사용할 참조변수형 제네릭 (기본형은 안됨)
		//선언시의 사용한 제네릭과 생성자에 사용하는 제네릭은 동일해야함 
		//자바 1.8부터는 생성자의 제네릭은 생략이 가능 
		//ArrayList<Product> productList = new ArrayList<>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		
//		productList = (Product)tvList
		
//		ArrayList<Product> tvList = new ArrayList<Tv>(); //제네릭이 다르면 에러 
		List<Tv> tvList1 = new ArrayList<Tv>(); 
		// 제네릭이 같고 이를 이용하는 클래스가 상속관계시에는 다형성이 적용 
		
		//상위 객체를 이용하여 하위 객체를 추가는 허용 되나 제네릭이 다른 경우 반환시는 형변환 
		productList.add(new Tv());
		productList.add(new Audio());
		
		printAll(productList);
		
		
		Tv t = (Tv)productList.get(0);
//		Product t3 = productList.get(0);
		
		
		Audio t1 =(Audio)productList.get(1);
		
//		Product t4 = productList.get(1);
		
		System.out.println(productList.get(0));
		System.out.println(productList.get(1));
		
	}
	static void printAll(ArrayList<Product> productList) {
		for (Product p : productList) {
			System.out.println(p);
		}
	}

}

class Product{
	
}
class Tv extends Product{
	
}

class Audio extends Product{
	
}
