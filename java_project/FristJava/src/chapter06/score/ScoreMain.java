package chapter06.score;

public class ScoreMain {
	public static void main(String[] args) {
		Student[] score = new Student[10];
		int numOfStudent = 0;
		Student s1 = new Student("손흥민", 100, 90, 90);
		score[numOfStudent] = s1;
		numOfStudent++;// 추가된 학생의 수를 +1 증가
		Student s2 = new Student("이강인", 100, 90, 90);
		score[numOfStudent] = s2;
		numOfStudent++;// 추가된 학생의 수를 +1 증가

		for (int i = 0; i < numOfStudent; i++) {
			/*
			 * System.out.println(score[i].getKoreanScore() + "\t" +
			 * score[i].getEnglishScore() + "\t" + score[i].getMathScore() + "\t" +
			 * score[i].getSum() + "\t" + score[i].getAverage());
			 */
			System.out.println(score[i]);
		}
		
		// 데이터 입력 -> 배열에 저장 
		// 데이터 검색 -> 배열의 요소(객체)에서 검샛
		// 데이터 삭제 -> 배열의 요소 삭제
	}
}
