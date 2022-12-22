package ch05;

public class Ex05Quiz {

	public static void main(String[] args) {
		
		String[] cars1 = {"Volvo","BMW","Ford","Mazda"};
		
		String[] cars2 = new String[] {"Volvo","BMW","Ford","Mazda"};
		
		String[] cars3 = new String[4];
		cars3[0] = "Volvo";
		cars3[1] = "BMW";
		cars3[2] = "Ford";
		cars3[3] = "Mazda";
		
		for (int i = 0; i < cars1.length; i++) {
			System.out.println(cars1[i]);
		}
		System.out.println();
		
		for (String string : cars2) {
			System.out.println(string);
		}
		System.out.println();
		
		int[][] myNumbers = {{1,2,3,4},{5,6,7}};
		
		System.out.println(myNumbers[1][1]);
		System.out.println();
		
		for (int i = 0; i < myNumbers.length; i++) {
			for (int j = 0; j < myNumbers[i].length; j++) {
				System.out.print(myNumbers[i][j]);
			}
		}
		System.out.println();
		
		for (int[] is : myNumbers) {
			for (int is2  :  is) {
				System.out.print(is2);
			}
		}
		
		System.out.println();
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		animal1.kind = "bird";
		animal1.age= 10;  
		animal1.name= "puppy";
		
		animal2.kind = "bird";
		animal2.age = 15;
		animal2.name = "kalchi";
		
		animal1.setAge(10);
				
	}
}


class Animal{
	String kind;
	int age;
	String name;
	
	public void setAge(int age) {
		this.age = age;
	}
	
}


//1. main 메서드를 만들기
//2. 문자열 배열 cars1를 만들고 초기값을 배열값 "Volvo","BMW","Ford","Mazda" 	로 초기
	
//3. 문자열 배열 cars2를 만들고 new를 이용하여 만들고 초기값은 "Volvo","BMW","Ford","Mazda" 사용

//4. 문자열 배열 cars3를 크키 4를 지정하여 만들고 각원소에 "Volvo","BMW","Ford","Mazda"를 넣어

//5. cars1의 원소값을 기본 for문을 이용하여 출력  

//6. cars2의 원소값을 enhnaced for 문을 이용하여 출력

//7. int로된 2차원 배열 myNumbers를 만들고 초기값은 {1,2,3,4},{5,6,7}를 이용 

//8. 2번째 행의 두번째 열값을 출력

//9. for문을 이용하여 각 원소값을 출력

//10. Animal 클래스를 이 java파일 안에 만듬

//11. 맴버변수는 kind(종), age, name

//12. 메소드는 public void setAge(int age){
//		this.age = age;
//}

//13. main 메서드 안에서 Animal 객체 animal1 과 animal2를 만듬 

//14. animal1의 kind는 bird , age 는 10, name은 puppy
//    animal1의 kind는 fish , age 는 15, name은 Kalchi

//15. 메서드 setAge를 call 해보세요  






