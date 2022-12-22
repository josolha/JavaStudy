package ch06;

public class recursivecall {

	public static void main(String[] args) {
		
		System.out.println(recursive.factorial(5));
		System.out.println(recursive2.precursive(5));
		System.out.println(recursive3.pprecursive(100));
		System.out.println(recursive4.ppprecursive(100));
	}

}
class recursive{
	
	static long factorial(int n) {
		
		long result = 0;
		
		if(n==1) {
			result = 1;
		} else {
			result = n * factorial(n-1);
		}
		
		return result;
	}
}

class recursive2{
	static long precursive(int n) {
		long result = 0;
		if (n==1) {
			result = 1;
		}
		else {
			result = n * precursive(n-1);
		}	
		return result;
	}
}

// 100 입력 했을때 100 보다 작은 짝수의 합 나타내시오.

class recursive3{
	
	static long pprecursive(int n) {
		
		long result  = 0;
		
		if(n==1){
			result = 0;
		
		}else if(n%2 ==0){
			
			result = n + pprecursive(n-1);
					//10 + 9 
		}else{
			result = pprecursive(n-1);
		}
		return result;
		
		}
}



class recursive4{
	
	static long ppprecursive(int n) {
		
		long result  = 0;
		
		while(n > 0){
		
			if(n%2 ==0){
				result = n + ppprecursive(n-1);
				
			}else{
				result = ppprecursive(n-1);
			}
			return result;
		}
		return result;
	}
}

