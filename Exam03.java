import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// �ǽ� : 2���� ����� �޾� 2���� ������ �� ū ���� ��ȯ�ϴ� �޼ҵ� lagerNumberrs()�� ��������.
		// �� ���ڰ� ���ٸ� 0�� ��ȯ.

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = lagerNumber(num1, num2);
		System.out.println("ū �� Ȯ�� : " + result);

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