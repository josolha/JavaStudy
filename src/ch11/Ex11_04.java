package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_04 {
	static Queue q = new LinkedList(); // Q는 인터페이스여서 LinkedList로 객체 생성 
	static final int MAX_SIZE = 5;   //  최근 다섯 개 
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다 ");
		
		while(true) {
			
			System.out.println(">>");
			try {
				//키보드 입력 받기 
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim(); // trim은 앞뒤 공백을 제거 
				if("".equals(input)) {
					continue;  // while문의 첫부분으로 
				}
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
					
				}else if(input.equals("help")){
					System.out.println("help - 도움말을 보여줍니다");
					System.out.println("q 또는 Q - 프로그램을 종료합니다");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE + "개 보여줍니다.");
					
				}else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					// 입력받은 명령어를 저장하고,
					save(input);
					
					LinkedList tmp = (LinkedList)q; //상위의 q를 하위인 tmp에 대입시는 형변환 
					ListIterator<Object> it = tmp.listIterator(); //List에 있는 ListIterator 메서드로 반복처리 객체만듬 
					
					while(it.hasNext()) { //  처리할 내용이 있는 지 파악 
						System.out.println(++i+"."+it.next()); // 남아있는 것 중에서 처음 것을 반환 
					}
				}else {
					save(input);
				}
				
			}catch(Exception e){
				e.printStackTrace();
				
				}
			}
		}
	static void save(String input) {
		//q에 저장 
		if(!("".equals(input))) {
			q.offer(input);
		}
		if(q.size() > MAX_SIZE) {
			q.remove(); // 첫번째 q원소를 제거 poll은 제거할 대상이 없을시는 예외 발생  
		}
		
			
	}
		
		
	}

