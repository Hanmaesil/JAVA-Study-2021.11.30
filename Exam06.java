import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		// �ǽ� : �迭�� �ִ� �����͸� ����Ͻÿ�

		int[] array = { 1, 3, 4, 8, 7, 9, 10 };
		arrayToString(array);

	}

	public static void arrayToString(int[] array) { // �޼ҵ� �ȿ��� �ٷ� ����� ���� ���� �� ��� void ���.
//		for(int i =0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		// Arrays Ŭ������ toString() �Լ� ����ϱ�.
		System.out.println(Arrays.toString(array));
	}

}
