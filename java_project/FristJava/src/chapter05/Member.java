package chapter05;

public class Member {
	String name;
	String phoneNum;
	String major;
	int studentClass;
	String email;
	int birthday;
	String address;

	Member(String name, String phoneNum, String major, int studentClass, String email, int birthday, String address) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.studentClass = studentClass;
		this.email = email;
		this.birthday = birthday;
		this.address = address;
	}

	Member(String name, String phoneNum, String major, int studentClass, String email) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.studentClass = studentClass;
		this.email = email;
	}

	public void print() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNum);
		System.out.println("전공: " + major + "전공");
		System.out.println("학년: " + studentClass + "학년");
		System.out.println("이메일: " + email);
		if (birthday != 0 && address != null) {

			System.out.println("생년월일: " + birthday);
			System.out.println("주소: " + address);
		}
	}

	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "010-1234-1234", "물리학", 3, "gd@naver.com", 960819, "강원도");
		m1.print();
		System.out.println("\n=========================================\n");
		Member m2 = new Member("홍길동", "010-1234-1234", "물리학", 3, "gd@naver.com");
		m2.print();
	}
}
