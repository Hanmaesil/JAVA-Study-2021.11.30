import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		// 절대값 실습 : 두개의 정수를 입력받아 매개변수로 넘기고 num1 - num2 를 뺀 결과값을 절대갑스올 바꾸어 출력하는
		// getAbsoluteValue() 메소드를 구현하시오.

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);

	}
	
	public static int getAbsoluteValue(int num1, int num2) {
		return Math.abs(num1 - num2);
		
	}
	
	
	
}	
