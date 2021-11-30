
public class Exam01 {

	public static void main(String[] args) {
		
		//실습 : 사칙연산! 메소드 이용!
		
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
		
//		System.out.println(add(3,5));
//		System.out.println(sub(3,5));
//		System.out.println(mul(3,5));
//		System.out.println(div(3,5));
		
		
		
		
		
		
	}

	public static int add(int num1, int num2) {
		
		System.out.println(num1 + num2);
		
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}	 
	public static int mul (int num1, int num2) {
		return num1 * num2;
	}
	public static int div (int num1, int num2) {
		return num1 / num2;
	}
	
}

