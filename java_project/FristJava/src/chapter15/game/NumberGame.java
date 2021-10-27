package chapter15.game;

//	10초 안에 맞추는 하이로우 게임을 만들어 봅시다.
//		① 1~100 사이의 랜덤 한 숫자를 추출합니다.
//		② 사용자에게 숫자를 입력 받고, 랜덤 숫자와 비교하고, 높은 숫자인지 낮은 숫자인지 출력
//		③ 10초 카운팅은 스레드를 이용해서 처리해봅시다.
//		④ 10초 이전에 맞추면 미션 성공, 10초가 지나면 프로그램 종료하는 흐름으로 만들어봅시다.

public class NumberGame {
	int num;

	public NumberGame(int num) {
		this.num = num;
	}
}
