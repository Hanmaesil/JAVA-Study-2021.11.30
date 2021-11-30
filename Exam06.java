import java.util.Arrays;

public class Exam06 {

	public static void main(String[] args) {
		// 실습 : 배열에 있는 데이터를 출력하시오

		int[] array = { 1, 3, 4, 8, 7, 9, 10 };
		arrayToString(array);

	}

	public static void arrayToString(int[] array) { // 메소드 안에서 바로 출력할 때는 리턴 값 대신 void 사용.
//		for(int i =0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		// Arrays 클래스의 toString() 함수 사용하기.
		System.out.println(Arrays.toString(array));
	}

}
