package ch04;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("메뉴1");
			System.out.println("메뉴2");
			System.out.println("메뉴3");
			System.out.println("원하는 메뉴 번호 (1~3)을 선택하고 종료는 0을 선택하세요 ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; //while 문 나옴
				
			}else if(!(menu >= 1 && menu <= 3 )) {
				System.out.println("메뉴를 잘못 선택하셨습니다");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu + "번 입니다.");
		}
		System.out.println("while문 밖입니다.");
		
		
		
	}

}
