package project02;

import java.util.Scanner;

public class Contact {
	public static Scanner scanner = new Scanner(System.in);

	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private int birthday;
	private String group;

	// 기본 생성자

	public Contact() {
	}

	// 매개변수가 있는 생성자

	public Contact(String name, String phoneNum, String email, String address, int birthday, String group) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// 연락처 정보를 출력하는 메소드

	public void printInfo() {
		System.out.println("이름: " + this.getName());
		System.out.println("전화번호: " + this.getPhoneNum());
		System.out.println("이메일: " + this.getEmail());
		System.out.println("주소: " + this.getAddress());
		System.out.println("생일: " + this.getBirthday());
		System.out.println("그룹: " + this.getGroup());
	}
}
