package chapter06;

public class String02 {
	// 문제 2. 다음 형태로 주민번호를 담고 있는 String 인스턴스를 하나 생성
	// String str = “990929-1010123”
	// 이 문자열을 이용하여 중간에 삽입된 – 를 뺀 String 인스턴스를 생성.

	public static void main(String[] args) {
		String str = "990929-1010123";

		String str2;
		str2 = str.replace("-", "");
		System.out.println(str2);

	}
}
