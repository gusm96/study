package chapter03;

import java.util.Scanner;

public class Calculator {
	// final 변수앞에 -> 상수
	// 클래스 앞에 사용 -> 상속의 대상이 아니다.
	// java에서 상수 : 변수에 최초 초기화된 값을 바꾸지 못한다.
	// 상수 표현은 대문자로 표현
	final float PI = 3.1415f;
	final String USER_NAME;

	// 생성자 : 초기화 메소드, 메소드 구조와 유사 반환기능 X
	// 클래스이름 (){}
	Calculator(String name) {
		USER_NAME = name;
	}

	// + and print
	public void add(int num1, int num2) {
		long result = (long) num1 + num2;
		System.out.printf("%d + %d = %d\n", num1, num2, result);
	}

	// - and print
	public void minus(int num1, int num2) {
		long result = (long) num1 - num2;
		System.out.printf("%d - %d = %d\n", num1, num2, result);
	}

	// * and print
	public void multiply(int num1, int num2) {
		long result = (long) num1 * num2;
		System.out.printf("%d * %d = %d\n", num1, num2, result);
	}

	// / and print
	public void devide(int num1, int num2) {
		float result = (float) num1 / num2;
		System.out.printf("%.1f / %.1f = %.2f\n", num1, num2, result);
	}

	// 실수 반지름 매개변수의 인자로 받아 원의 둘레를 반환하는 메소드를 반환하는 메소드를 정의
	float perimeter(float num1) {

		float result = 2 * PI * num1;

		return result;
	}

	// 실수 반지름 매개변수의 인자로 받아 원의 넓이를 반환하는 메소드를 반환하는 메소드를 정의
	float weghit(float num1) {

		float result = PI * num1 * num1;

		return result;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator("구성모");
		Scanner scanner = new Scanner(System.in);
		System.out.println("PI: " + cal.PI);
		System.out.println("User Name: " + cal.USER_NAME);
		System.out.println("첫번째 숫자를 입력해주세요.");
		System.out.print("> ");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("두번째 숫자를 입력해주세요.");
		System.out.print("> ");
		int num2 = Integer.parseInt(scanner.nextLine());
		cal.add(num1, num2);
		cal.minus(num1, num2);
		// cal.multiply(num1, num2);
		// cal.devide(num1, num2)
		System.out.println("\n========================================\n");
		System.out.println("원의 둘레와 넓이를 구합니다. \n반지름을 입력해주세요.");
		float r = Float.parseFloat(scanner.nextLine());

		System.out.println("전달받은 반지름: " + r);
		System.out.println("원의 둘레: " + cal.perimeter(r));
		System.out.println("원의 넓이: " + cal.weghit(r));
		scanner.close();
	}
}
