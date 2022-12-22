package ch09;

public class Ex09_08 {

	public static void main(String[] args) {
		//배열의 크기가 0인 char배열
		char[] cArr = new char[0];
		//char[] cArr = {};
		String s = new String(cArr); //String S = "";
		//java.lang.String.String(char[] value)
		//String s = new String("");
		
		System.out.println("cArr.length = "+ cArr.length);
		System.out.println("@@@" + s+ "@@@");
	}
}
