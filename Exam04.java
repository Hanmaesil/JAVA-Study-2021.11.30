import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// �ǽ� : 2���� ������ �޾� 2���� ���� �� 10�� �� ����� ���� ��ȯ�ϴ� �޼ҵ� close10�� ��������.
		// ��, �� ���� ��� 10���� ���̰� ���ٸ� 0�� ��ȯ

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}
	
	public static int close10(int num1, int num2) {
		if(Math.abs(10 - num1) > Math.abs(10 - num2)) {
			return num2;
		}else if(Math.abs(10 - num1) < Math.abs(10 - num2)) {
			return num1;
		}else {
			return 0;
		}
	}
	
//	//������ Ǯ��
//	// 1. 10���� ���� ���̳��� ���� ����� ����
//	int i = 10 -num1;
//	int j = 10 -num2;
//	
//	//���׿����� Ȱ��
//	i = i > 0 ? i : (i * -1);
//	j = j > 0 ? j : (j * -1); 
//	// 2. 10���� ���� �� ����� �� ã��
//	
//	if(a > b) {
//		return num2;
//	}else if(a < b) {
//		return num1;
//	}else {
//		return 0;
//	}
	
//	//���밪 Ȱ��
//	int a = Math.abs(10 - num1);
//	int b - Math.abs(10 - num2);
	
	
}
