package chapter07.person;

import java.util.Calendar;

public class Person {
	String name; // 이름
	String rrn; // 주민등록 번호

	final static int CURRENT = Calendar.getInstance().get(Calendar.YEAR); // 현재 year
	public Person(String name, String rrn) {

		this.name = name;
		this.rrn = rrn;
	}
// 나이 계산 메소드
public int age() {
		// 주민번호의 앞에서 두자리를 구해준다(생년)
		int year = Integer.parseInt(rrn.substring(0, 2));	
		
		// 주민번호 뒷자리의 첫번째 자리
		int year2 = Integer.parseInt(rrn.substring(7, 8));	
		// 1, 2 는 1900 년대 3,4 는 2000 년대
		if(year2 == 1 || year2 == 2) {
			return CURRENT - (1900 + year);
		} else if(year2 == 3 || year2 == 4) {
			return CURRENT - (2000 + year);		
		} else {
			return -1;	 // 잘못된 주민번호의 경우
		}
	}
	
	public void greeting() {
		
		System.out.println("안녕하세요. 저는 " + this.name + "입니다. " + this.age() + "살 입니다.");

	}

}
