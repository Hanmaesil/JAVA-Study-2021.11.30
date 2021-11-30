import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// 실습 : 2개의 양수를 받아 2개의 숫자중 더 큰 수를 반환하는 메소드 lagerNumberrs()를 만들어보세요.
		// 단 숫자가 같다면 0을 반환.

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자 입력 : ");
		int num2 = sc.nextInt();

		int result = lagerNumber(num1, num2);
		System.out.println("큰 수 확인 : " + result);

	}

	public static int lagerNumber(int num1, int num2) {

		return num1 > num2 ? num1 : (num1 == num2? 0 : num2);
		
		
		
		
//		if (num1 > num2) {
//			return num1;
//		} else if (num2 > num1) {
//			return num2;
//		} else {
//			return 0;
//
//		}

	}

}