package ch13;

public class Ex13_12 {
	
//Thread의 동기화를 적용안한 경우 잔액 처리가 마무리 되기전 또 출금이 이루어져 잔액이 -가 나옴 

	public static void main(String[] args) {
		Runnable r = new Runnable12();
		//thread2개가 run메서드를 실행 
		new Thread(r).start();
		new Thread(r).start();
		
	}

}
class Account{ //계좌 처리 클래스 
	private int balance = 1000; //잔액 
	
	public int getBalance() { // 잔액 반환 
		return this.balance;
	}
	public void withdraw(int money) { // 출금처리 
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				this.balance -= money;
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
class Runnable12 implements Runnable{
	
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money = (int)(Math.random() *3 +1)*100;
			//100,200,300
			acc.withdraw(money);
			System.out.println("balance : "+acc.getBalance());//출금후 잔액 
		}
	}
}

