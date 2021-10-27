package chapter15;

public class ThreadTest1 {
	public static void main(String[] args) {

		// 쓰레드 인스턴스 생성
		ShowTheard t1 = new ShowTheard("멋진 쓰레드");
		ShowTheard t2 = new ShowTheard("             예쁜 쓰레드");

		// 쓰레드 실행 : run() 직접 호출한경우 쓰레드 환경(새로운 작업)이 생성되지 않는다.
		t1.start();
		t2.start();

		for (int i = 0; i < 100; i++) {
			System.out.println("---------------------메인 스래드");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
