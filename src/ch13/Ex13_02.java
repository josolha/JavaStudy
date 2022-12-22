package ch13;

public class Ex13_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		//currentTimeMillis()는 posix타임으로 1970.1.1.0 이후 경과한 밀리세컨드 
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
			// "-" 을 사용보다 new String()을 사용하면 시간이 더 걸림 
		}
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 :" +( endTime - startTime));
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|")); 
		}
		endTime = System.currentTimeMillis();
		System.out.println("소요시간2 :" + (endTime - startTime));
		
	}

}
