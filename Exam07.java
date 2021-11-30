import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		// �ǽ� : ����� ���� ���Ͽ� ��ȯ�ϴ� getSumOfDivisors() �޼ҵ带 �����ϼ���.

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		int result = getSumOfDivisors(num);

		System.out.println(num + "�� ����� �� : " + result);
		getDivisor(num);
		
	}

	public static void getDivisor(int num) {
		System.out.print(num + "�� ����� : ");
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
