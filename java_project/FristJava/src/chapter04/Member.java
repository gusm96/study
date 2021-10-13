package chapter04;

import java.util.Calendar;

public class Member {
	String name;
	int year;
	
	Member(String name, int year) {
		this.name = name;
		this.year = 2021 - year;
		// 올해 연도를 가져올 수 있는 int year = Calendar.getInstance().get(Calendar.YEAR); 를 사용하자
	}

	public void confirm(int year) {

		if (year < 15 && year >= 65) {
			System.out.println("무료예방접종이 가능합니다.");

		} else {
			System.out.println("무료접종 대상자가 아닙니다.");
		}

	}

	public void checkup(int year) {
		if (year > 19) {
			System.out.println("건강검진 대상입니다.\n( 건강검진은 2년마다 무료로 받을 수 있습니다. )");
			if(year % 2 == 0) {
				System.out.println("올해 짝수 해 검사 대상입니다.");
			}
			if (year >= 40) {
				System.out.println("암 검사도 무료로 받을 수 있습니다.");
			}

		}else {
			System.out.println("건강검진 대상이 아닙니다.\n( 만 19세 이상부터 건강검진 대상입니다. )");
		}
	}

	public static void main(String[] args) {
		Member m1 = new Member("구성모", 2013);
		System.out.println(m1.name + "님의 결과");
		m1.confirm(m1.year);
		m1.checkup(m1.year);
	}
}
