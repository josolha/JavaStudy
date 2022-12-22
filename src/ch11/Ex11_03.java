package ch11;

import java.util.Stack;

public class Ex11_03 {

	public static void main(String[] args) {
		if(args.length !=1) {
			System.out.println("사용방법 : ((2+3)*1+3)");
			System.exit(0); // 프로그램 
			
		}
		Stack st = new Stack();
		String expresstion = args[0];
		
		System.out.println("expresstion : " + expresstion);
		try {
			
				for (int i = 0; i < expresstion.length(); i++) {
					char ch = expresstion.charAt(i);
					if(ch == '(') {
						st.push(ch + "");
					}else if(ch==')') {
						st.pop();
					}
					
				}			
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다 ");
			}else {
				System.out.println("괄호가 일치하지 않습니다 ");
			}
		}
		catch(Exception e ){
//			System.out.println(e.getMessage());
			System.out.println("괄호가 일치하지 않습니다 ");
		}

}
}
