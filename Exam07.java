import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		// 실습 : 약수의 합을 구하여 반환하는 getSumOfDivisors() 메소드를 구현하세요.

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result);
		getDivisor(num);
		
	}

	public static void getDivisor(int num) {
		System.out.print(num + "의 약수는 : ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
