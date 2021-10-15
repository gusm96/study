package chapter06;

// 1. 국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 평균 점수를 출력하는 프로그램을 작성해봅시다.

// 2.     Student 클래스를 정의해봅시다.
//	①    학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//	②    변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//	③    총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.

// 3.     main()메소드에 아래 내용을 정의해봅시다.
//	①    Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//	②    Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//	③    배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.

public class Student {
	final int MAX_SCORE = 100;
	final int MIN_SCORE = 50;

	// 10명의 핵생의 국어, 영어, 수학 점수를 담을 2차원 배열
	// 점수는 math.random 을 이용하자

	public static void score() {
		int[][] arr = new int[10][3];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("학생%d 점수\n", i + 1);
			System.out.println("국어\t영어\t수학\t");
			for (int j = 0; j < arr[i].length; j++) {
				int score = (int) (Math.random() * 100);

				arr[i][j] = score;
				System.out.print(score + "\t");

			}
			// Average

			int sum = arr[i][0] + arr[i][1] + arr[i][2];
			double average = (double) sum / arr[i].length;
			System.out.println();
			System.out.printf("평균점수: %.2f\n", average);

			System.out.println();
		}

		System.out.println("--------------------------");
	}

	public static void main(String[] args) {
		score();
	}
}
