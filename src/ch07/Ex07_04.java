package ch07;

public class Ex07_04 {

	public static void main(String[] args) {
		
//		Point3D01 p = new Point3D01(1,2,3);
//		System.out.println();
		
	}

}

//class Point{
//	int x, y;
//	
//	// 생성자 Point(int x, int y)가 만들어 지면 기본형 생성자 Point(x,y)는 사라
//	Point(int x, int y){
//		//묵시적인 super() Object의 생성자 호출
//		this.x = x;
//		this.y = y;
//		
//	}
//}
//class Point3D extends Point{
//	int z;
//	Point3D(int x, int y, int z){
//		//상위의 클래스에 생성자가 있으면 기본형 super()은 사용을 못함. 
//		
//		super(x,y); //상위 생성자로 상위의 멤버변수를 초기
//		this.z = z; //하위 맴버변수는 하위 생성자에서 만드는 것을 권고 
//	}
//}



class Point2{
	int x, y;
	
	Point2(){
		
	}
	
	// 생성자 Point(int x, int y)가 만들어 지면 기본형 생성자 Point(x,y)는 사라
	Point2(int x, int y){
		//묵시적인 super() Object의 생성자 호출
		this.x = x;
		this.y = y;
		
	}
}

class Point3D2 extends Point2{
	
	int z;
	
	Point3D2(int x, int y, int z){
		
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
}