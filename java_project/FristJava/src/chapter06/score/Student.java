package chapter06.score;
//2.     Student 클래스를 정의해봅시다.

//	①    학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.
//	②    변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.
//	③    총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.

//3.     main()메소드에 아래 내용을 정의해봅시다.
//	①    Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//	②    Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//	③    배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.

// 점수는 Math.random()으로 생성하여 setter를 이용해 점수를 저장해준다.
// 총점은  getter 를 이용하여 저장된 국어, 영어, 수학 점수값을 가져와 서로 합해준다.
// 평균점수는 총점/과목수 

// 저장된 정보를 Array에 넣어준다.
// 과목별 총점과 평점은 
// 
public class Student {
	private String name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;

	public Student(String name, int koreanScore, int englishScore, int mathScore) {

		this.name = name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKoreanScore() {
		return koreanScore;
	}

	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getSum() {
		return this.koreanScore + this.englishScore + this.mathScore;
	}

	public float getAverage() {
		return getSum() / 3.0f;
	}

	@Override
	public String toString() {
		return name + "\t" + koreanScore + "\t" + englishScore + "\t" + mathScore + "\t" + getSum() + "\t"
				+ getAverage();
	}

}
