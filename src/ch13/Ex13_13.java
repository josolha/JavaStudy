package ch13;

public class Ex13_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new Runnable13();
		//thread2개가 run메서드를 실
		new Thread(r).start();
		new Thread(r).start();
	}

}
class Account2{ //계좌 처리 클래스 
	private int balance = 1000; //잔액 
	
	public int getBalance() { // 잔액 반환 
		return this.balance;
	}
	
	//임계영역인 withdraw메서드에 동기화 처리 synchronized 메서드로 선언 
	public synchronized void withdraw(int money) { // 출금처리 
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
class Runnable13 implements Runnable{
	
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

