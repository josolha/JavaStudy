package ch07;

public class Ex07_09 {

	public static void main(String[] args) {
		Buyer0709 b = new Buyer0709();
		b.buy(new Tv0709());
		b.buy(new Computer0709());
		b.buy(new Computer0709());
		b.buy(new Computer0709());
		b.buy(new Computer0709());
		b.buy(new Computer0709());
		b.buy(new Computer0709());
		b.buy(new Computer0709());
//		b.summary();
	}

}
class Product0709{
	int price;
	int bonusPoint;
	
	Product0709(){
		
	}
	Product0709(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

}
class Tv0709 extends Product0709{
	Tv0709(){
		super(100);
		}
	@Override
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Tv";
	}
}
class Computer0709 extends Product0709{
	
	Computer0709(){
		super(200);
	}
	
	@Override
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Computer";
	}
	
}
class Audio0709 extends Product0709{
	
	Audio0709(){
		super(200);
	}
	
	@Override
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Audio";
	}
	
}
class Buyer0709{
	int money = 1000;  //소유금액 
	int bonusPoint = 0;  // 보너스점수  
	
	Product0709[] cart = new Product0709[10]; //원소를 10개 지정 
	
	int i = 0;
	
	void buy(Product0709 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] =p;
		
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for (int i = 0; i < cart.length; i++) {
			if(cart[i]==null)
				break;
			sum += cart[i].price;
			itemList += cart[i] + ",";
		}
		System.out.println("총 금액은 " + sum);
		System.out.println("제품리스트는 " + itemList);
	}
}

