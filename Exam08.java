
public class Exam08 {

	public static void main(String[] args) {

		// 메소드 오버로딩(중복정의) :(매소드 중복정의) 메소드 이름은 하나만 주고 매개변수를 다르게 함으로서 메소드를 여러개 만드는 기법.
		//system.out.print 도 오버로딩이다.
		
		//메소드 오버로딩의 조건
		//****1. 메소드 이름이 같아야 한다. 단! 매개변수의 개수 또는 타입이 달라야함 -> 전부 또는 일부도 가능****
		//-> 매개변수는 같고 리턴타입이 다른경우는 오버로딩이 아님!!
		
		//메소드 오버로딩의 장점
		//1. 메소드 이름의 낭비 방지.
		//2. 같은 메소드에 여러 종류의 매개변수를 받을 수 있음.
		
		
//		int a = 10;
//		int b = 2;

		// 두개의 수를 더해줄 수 있는 add 함수 만들기.

		add(10, 2);
		add1(10, 2.4);
		
		
		
		
	}
	// 기존의 add 메소드
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	//정수형의 add메소드를 중복정의 하여 생성된 메소드
	public static void add1(int a, double b) {
		System.out.println(a+b);
	}
	
	
	
}
