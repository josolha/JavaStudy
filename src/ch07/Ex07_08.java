package ch07;

public class Ex07_08 {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		b.buy(new TVex0708()); // Product 파라미터에 하위 클래스인 TVex0708 사용 
		b.buy(new Computer());
		
		System.out.println("남은 돈은 : " + b.money);
		System.out.println("보너스는 : " +b.bonusPoint);
		
		
	}

}
class Product{
	int price;
	int bonusPoint;
	
	Product(){
		
	}
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class TVex0708 extends Product{
		
	TVex0708(){
		super(100);
	}
	
	@Override
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{
	
	Computer(){
		super(200);
	}
	
	@Override
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	 
	void buy(Product p) {  
		// 상위 클래스인 Product를 매개변수로 사용하면 다형성이 적용
		// Product의 하위 클래스를 객체를 인자로 사용 가능
		
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하셨습니다.");
		// p 객체를 print시 p.toString()이 실행  //컴파일시 자동  toString() 찾아감.
		
	}
	
	
}

