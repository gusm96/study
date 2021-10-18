package chapter06.score;

public class ScoreMain1 {
	public static void main(String[] args) {

		
		ScoreManager manager = new ScoreManager();
		
		// 데이터 저장
		manager.insertScore(new Student("손흥민", 100, 90, 100));
		manager.insertScore(new Student("KING", 90, 90, 100));
		manager.insertScore(new Student("SCOTT", 80, 90, 90));
		// 데이터 전체 출력
		manager.showAllData();
		// 데이터 검색 
//		manager.searchData("손흥민");
//		manager.searchData("케인");
//		
//		// 데이터 삭제
//		manager.deleteScore("scott");
//		manager.deleteScore("kane");
		// 데이터 검색 또는 전체 데이터 출력
		
		manager.showAllData();
	}
}
