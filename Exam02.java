import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// �ǽ�
		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();

		System.out.print("������ �Է�(- , *, +, /) : ");
		String op = sc.next(); // ���ڿ� ��ĳ�ʷ� �Է¹ޱ� char op = sc.next().
//		char op = sc.next().charAt(); // ���ڿ� ��ĳ�ʷ� �Է¹ޱ�

		System.out.println("��� �� : " + cal(num1, num2, op));

	}

	// cal �޼ҵ� ����!
	public static int cal(int num1, int num2, String op) {

		// +, -, *, / �����ϵ��� �����ϱ�!

		// ����� ���� �� �ִ� ���� ����
//		int result = 0;

		// ������ ���ϱ�
		if (op.equals("-")) { // ���ڿ� �񱳴� .equlas!!!!!! �������!!
			// ���꿡 ���� �۾� ����
			return num1 - num2;
//			result = num1 - num2;
//		return	result = num1 - num2;

		} else if (op.equals("*")) {
			return num1 * num2;
//			result = num1*num2;
//	    return result = num1*num2;
		} else if (op.equals("+")) {
			return num1 + num2;
		} else if(op.equals("/")) {
			return num1 / num2;
		}else {   //else�� ���ٸ� ������ �̿��� ���� �Էµ� �� �ֱ� ������ ������ ���´�.
			return 0;
		}

//		return result;

//	//ĳ���Ϳ� ����ϱ�.
//	public static int cal(int num1, int num2, char op) {
//		if(op == '-') {
//			return num1 - num2;
//		}else {
//			return num1 * num2;
//		}
//	}

	}
}
