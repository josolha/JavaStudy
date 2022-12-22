package ch09;

public class Ex09_12 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		// 생성자중 stringBuffer(String str)
		// StringBuffer()는 16개 문자 수용 객체 
		// StringBuffer(int length)는 length객체의 문자를 지정하는 객체 생성 
		StringBuffer sb2 = sb.append(23);
		// append(모든 데이터 형)
		//sb2와 sb는 주소가 같은 객체 
		sb.append('4').append(56); //sb2의 값도 동일 
		
		StringBuffer sb3 = sb.append(78);// sb와 sb3도 주소 동일 
		sb3.append(9.0); // sb,sb2,sb3에 모두 반영 
		
		System.out.println("sb =" +sb);
		System.out.println("sb2 =" +sb2);
		System.out.println("sb3 =" +sb3);
		
		System.out.println("sb = "+ sb.deleteCharAt(10));
		// deleteChatAt(색인번호)는 색인번호의 문자를 삭제하고 변환은 자기 객체
		System.out.println("sb = " +sb.delete(3,6)); // 색인번호 3번부터 (6-1)까지 삭제
		
		System.out.println("sb = " +sb.insert(3, "abc")); //색인번호 3번에 삽입 
		System.out.println("sb = " +sb.replace(6,sb.length(),"END"));
		//6번 색인번호 부터 마지막 색인번(sb.length()-1)가지 삭제 
		
		System.out.println("capacity = " +sb.capacity()); //버퍼크기
		System.out.println("length = " +sb.length()); // 문자개수 
		
	}

}
