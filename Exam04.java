import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// 실습 : 2개의 정수를 받아 2개의 숫자 중 10에 더 가까운 수를 반환하는 메소드 close10을 만들어보세요.
		// 단, 두 숫자 모두 10과의 차이가 같다면 0을 반환

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

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
	
//	//선생님 풀이
//	// 1. 10으로 부터 차이나는 값을 양수로 수정
//	int i = 10 -num1;
//	int j = 10 -num2;
//	
//	//삼항연산자 활용
//	i = i > 0 ? i : (i * -1);
//	j = j > 0 ? j : (j * -1); 
//	// 2. 10으로 부터 더 가까운 수 찾기
//	
//	if(a > b) {
//		return num2;
//	}else if(a < b) {
//		return num1;
//	}else {
//		return 0;
//	}
	
//	//절대값 활용
//	int a = Math.abs(10 - num1);
//	int b - Math.abs(10 - num2);
	
	
}
