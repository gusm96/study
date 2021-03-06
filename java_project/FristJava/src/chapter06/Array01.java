package chapter06;

import java.util.Scanner;

//문제 1.
//
//int형 1차원 배열을 매개변수로 전달 받아서 배열에 저장된 최대값,
//그리고 최소값을 구해서 반환하는 메소드를 다음의 형태로 각각 정의.
//
//public static int miniValue(int[] arr) { . . . . } // 최소값 반환
//
//public static int maxValue(int[] arr) { . . . . } // 최대값 반환
//
//위의 두 매소드는 인자로 전달되는 배열의 길이에 상관없이 동작하도록 정의.
//두 매소드 실행을 확인인하기 위한 main 메소드 정의.
//int형 배열에 채워질 정수는 프로그램 사용자로부터 입력 받고, 배열의 길이는 임의로 결정
public class Array01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

		// 임시 배열을 생성
		int[] temp = arr1[arr1.length - 1];

		for (int i = arr1.length - 1; i > 0; i--) {
			arr1[i] = arr1[i - 1];

		}
		arr1[0] = temp;
		System.out.println("시프트");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}

	
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("숫자를 입력하세요.");
			System.out.print("> ");
			arr[i] = scanner.nextInt();
		}

		System.out.println("최소값: " + minValue(arr));
		System.out.println("최대값: " + maxValue(arr));

		// 2차원 배열의 선언
		int[][] arr3 = { { 1, 2, 3, }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 } };

		System.out.println("2차원 배열 출력");
		addOneArr(arr3, 10);
		System.out.println("=========================================");
		// for -each
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=========================================");
		System.out.println("for-each");
		for(int num : arr) {
			System.out.println(num);
		}
		scanner.close();
	}

	public static int minValue(int[] arr) {
		int min = arr[0];

		// arr[i] 번째의 값과 min의 값을 배열의 길이만큼 비교해서
		// 가장 작은 값을 최종적으로 min 에 담는다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		// 최소값 min을 반환
		return min;
	}

	public static int maxValue(int[] arr) {
		int max = arr[0];

		// arr[i] 번째의 값과 max의 값을 배열의 길이만큼 비교해서
		// 가장 큰 값을 최종적으로 max에 담는다.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// 최대값 max를 반환
		return max;
	}

	public static void addOneArr(int[][] arr, int add) {

		// 출력
		// 행
		for (int i = 0; i < arr.length; i++) {
			// 열
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

		// 매개변수로 전달받은 숫자를 각 요소에 더해준다.
		for (int i = 0; i < arr.length; i++) {
			// 열
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] += add;
			}

		}
		System.out.println("각 요소에 숫자를 더하기 ============================");
		// 출력
		// 행
		for (int i = 0; i < arr.length; i++) {
			// 열
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
