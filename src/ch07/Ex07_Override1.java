package ch07;

public class Ex07_Override1 {

	public static void main(String[] args) {
		
	Point3D point = new Point3D();
	point.x = 20;
	point.y = 30;
	point.z = 30;
	
	String result = point.getLocation();
	System.out.println(result);
	
	Point point2 = new Point();
	point2.x = 10;
	point2.y = 20;
	System.out.println(point2.getLocation());
	
	Point point3 = new Point3D();
	point3.x = 10;
	point3.y = 20;
//	point3.z = 40; 접근불가.
	System.out.println(point3.getLocation());
	
		
		
		
	}

}
class Point{ //상속이 없으므로 extends Object가 생략됨  
	int x,y; // 제어자는 제일 앞에 오며 public, protected 없음 private 이며
	//접근 범위가 앞에서 부터 갈수록 접근 범위가 적음 
	//public은 프로젝트 어디서나 접근, protected 는 패키지가 다르더라도 상속한 클래스는 접근 
	//없은 (defalut)는 패키지가 같은 경우만 접근, private는 자기 클래스 안에서만 접근
	
	//접근제어자 접근 범위는 넓은 제어자로는 변경 가능.
	
	String getLocation() {
		
		return " x : " + x + " y : " + y;
	}
}

class Point3D extends Point{ // Point 클래스를 상속
	//point와 object도 상속
	//상속한 것은 맴버변수 x,y 메서드 getLocation()
	// 맴버 변수 추가
	int z;
	
	// 상속한 메서드를 수정하여 사용 (Override)
	@Override // 메서드를 수정하여 Override함을 나타내는 어노테이션.
	String getLocation() {
		return " x : " + x + " y : " + y+ " z : "+z;
	}
	
}