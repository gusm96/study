package project;

import java.util.Scanner;

public class Project01 {
	public static Scanner scanner;

	private String name;
	private String phoneNum;
	private String email;
	private String address;
	private int birthday;
	private String group;

	Project01(String name, String phoneNum, String email, String address, int birthday, String group) {

		this.name = name;
		this.phoneNum = phoneNum;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	Project01() {
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
	
	
	// 사용자 입력값을 받아 setter를 이용하여 데이터 저장.
	public void saveInfo(Project01 user) {

		System.out.println("이름을 입력해주세요.");
		System.out.print("> ");
		user.setName(scanner.nextLine());

		System.out.println("전화번호를 입력해주세요.");
		System.out.print("> ");
		user.setPhoneNum(scanner.nextLine());

		System.out.println("이메일을 입력해주세요.");
		System.out.print("> ");
		user.setEmail(scanner.nextLine());

		System.out.println("주소를 입력해주세요.");
		System.out.print("> ");
		user.setAddress(scanner.nextLine());

		System.out.println("생일을 입력해주세요.");
		System.out.print("> ");
		user.setBirthday(scanner.nextInt());
		scanner.nextLine();

		System.out.println("그룹을 입력해주세요.");
		System.out.print("> ");
		user.setGroup(scanner.nextLine());
	}
	// user에 저장된 연락처 정보를 getter로 가져와 출력
	public void getInfo(Project01 user) {
		System.out.println("\n-------------------------------------------------------\n");
		System.out.println("이름: " + user.getName());
		System.out.println("전화번호: " + user.getPhoneNum());
		System.out.println("이메일: " + user.getEmail());
		System.out.println("주소: " + user.getAddress());
		System.out.println("생일: " + user.getBirthday());
		System.out.println("그룹: " + user.getGroup());
		System.out.println("\n-------------------------------------------------------\n");
		
	}
	// 저장된 연락처 정보를 수정할 수 있도록 하는 메소드.
	public void update(Project01 user) {
		while(true) {
			System.out.println("정보를 수정하시겠습니까? Y/N");
			System.out.print("> ");
			String yesNo = scanner.nextLine();
			if (yesNo.equalsIgnoreCase("y")) {
				// update 메소드 실행
				// 다시 saveInfo 실행해준다.
				user.saveInfo(user);
				user.getInfo(user);
			} else {
				scanner.close();
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Project01 user = new Project01();
		user.saveInfo(user);
		user.getInfo(user);
		user.update(user);
		

	}

}
