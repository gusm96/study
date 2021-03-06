package chapter15;

public class AccessThread extends Thread {
	IHaveTwoNum twoNum;

	public AccessThread(IHaveTwoNum twoNum) {
		this.twoNum = twoNum;
	}

	@Override
	public void run() {
		twoNum.addOneNum1();
		twoNum.addOneNum2();

		twoNum.addTwoNum1();
		twoNum.addTwoNum2();
	}

}
