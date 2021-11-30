import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		// 실습
		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		System.out.print("연산자 입력(- , *, +, /) : ");
		String op = sc.next(); // 문자열 스캐너로 입력받기 char op = sc.next().
//		char op = sc.next().charAt(); // 문자열 스캐너로 입력받기

		System.out.println("결과 값 : " + cal(num1, num2, op));

	}

	// cal 메소드 정의!
	public static int cal(int num1, int num2, String op) {

		// +, -, *, / 가능하도록 수정하기!

		// 결과를 담을 수 있는 변수 생성
//		int result = 0;

		// 연산자 비교하기
		if (op.equals("-")) { // 문자열 비교는 .equlas!!!!!! 기억하자!!
			// 연산에 따른 작업 진행
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
		}else {   //else가 없다면 연산자 이외의 것이 입력될 수 있기 때문에 오류가 나온다.
			return 0;
		}

//		return result;

//	//캐릭터열 사용하기.
//	public static int cal(int num1, int num2, char op) {
//		if(op == '-') {
//			return num1 - num2;
//		}else {
//			return num1 * num2;
//		}
//	}

	}
}
