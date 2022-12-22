package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		//put는 파라미터로 object를 사용 HashMap map(object key, object, value)
		map.put("asdf","1111");
		map.put("asdf","1234");
		//Map은 key는 중복이 안됨 만일 중복키가 put되면 나중것이 덮어 쓴다
		//key가 다르면 값은 중복 해도 됨. 
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 password를 입력해주세요");
			System.out.print("id :");
			String id = s.nextLine().trim(); //key로 사용 
			
			System.out.print("password :");
			String password = s.nextLine().trim(); // value로 사용 
			System.out.println();
			
			if(!map.containsKey(id)) {
				//get(key)는 키로 값을 반환 
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요. ");
				continue;
			}
			if(!(map.get(id)).equals(password)) {
				System.out.println("비밀번호가 일치 하지 않습니다. 다시 입력해주세요 ");
			}
			else {
				System.out.println("id와 비밀번호가 일치합니다 .");
				break;
			}
				
		}
	}

}
