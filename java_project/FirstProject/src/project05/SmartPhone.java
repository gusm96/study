package project05;

import java.util.Scanner;

public class SmartPhone {
	public static Scanner scanner = new Scanner(System.in);

	private Contact[] info;
	private int numOfContact;

	public static void setScanner(Scanner scanner) {
		SmartPhone.scanner = scanner;
	}

	public SmartPhone(int size) {
		info = new Contact[size];
		numOfContact = 0;
	}

	public SmartPhone() {
		this(10);
	}

	// 데이터를 추가
	public void add(Contact c) {
		info[numOfContact++] = c;
	}

	// 사용자 입력값을 받아 setter를 이용하여 데이터 저장.
	public void insert() {
		System.out.println("이름을 입력해주세요.");
		System.out.print("> ");
		String name = scanner.nextLine();

		System.out.println("전화번호를 입력해주세요.");
		System.out.print("> ");
		String phoneNum = scanner.nextLine();

		System.out.println("이메일을 입력해주세요.");
		System.out.print("> ");
		String email = scanner.nextLine();

		System.out.println("주소를 입력해주세요.");
		System.out.print("> ");
		String address = scanner.nextLine();

		System.out.println("생일을 입력해주세요.");
		System.out.print("> ");
		int birthday = scanner.nextInt();
		scanner.nextLine();

		System.out.println("그룹을 입력해주세요.");
		System.out.println("1. 회사 2. 거래처 3. 기타");
		System.out.print("> ");
		int select = Integer.parseInt(scanner.nextLine());
		if (select == 1) {
			// 회사 정보 저장
			String group = "회사";
			System.out.println("회사명을 입력하세요.");
			System.out.print("> ");
			String commpanyName = scanner.nextLine();

			System.out.println("부서명을 입력하세요.");
			System.out.print("> ");
			String department = scanner.nextLine();

			System.out.println("직급을 입력하세요.");
			System.out.print("> ");
			String position = scanner.nextLine();

			add(new CompanyContact(name, phoneNum, email, address, birthday, group, commpanyName, department,
					position));

		} else if (select == 2) {
			// 거래처 정보 저장
			String group = "거래처";
			System.out.println("거래처명을 입력하세요.");
			System.out.print("> ");
			String customer = scanner.nextLine();

			System.out.println("거래품목을 입력하세요.");
			System.out.print("> ");
			String item = scanner.nextLine();

			System.out.println("직급을 입력하세요.");
			System.out.print("> ");
			String position = scanner.nextLine();

			add(new CustomerContact(name, phoneNum, email, address, birthday, group, customer, item, position));
		} else if (select == 3) {
			// 사용자 설정 그룹
			System.out.println("그룹명을 입력하세요.");
			System.out.print("> ");
			String group = scanner.nextLine();
			// 입력 받은 정보들을 add()메소드를 이용하여 배열에 저장
			add(new Contact(name, phoneNum, email, address, birthday, group));
		}

	}

	public void printAll() {
		System.out.println("--------------------------------------");
		System.out.println("연락처 정보");
		for (int i = 0; i < numOfContact; i++) {
			System.out.println("--------------------------------------");
			info[i].printInfo();
			System.out.println("--------------------------------------");
		}
		System.out.println("--------------------------------------");
	}

	// 이름으로 배열의 index를 찾아 index값을 반환하는 메소드
	private int searchIndex(String name) {
		int index = -1;
		for (int i = 0; i < numOfContact; i++) {
			if (info[i].getName().equalsIgnoreCase(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	// 검색할 이름을 입력 받아 searchIndex()를 이용해 index값을 구하고
	// 해당 연락처를 찾아 출력한다.
	public void searchInfo() {
		System.out.println("검색할 연락처 이름을 입력하세요.");
		System.out.print("> ");
		String name = scanner.nextLine();
		int index = searchIndex(name);
		if (index > -1) {
			info[index].printInfo();
		} else {
			System.out.println("검색하신 연락처는 존재하지 않습니다.");
		}

	}

	// 저장된 연락처 정보를 수정할 수 있도록 하는 메소드.

	public void update() {
		System.out.println("수정할 연락처의 이름을 입력해주세요.");
		System.out.print("> ");
		String name = scanner.nextLine();
		int index = searchIndex(name);
		if (index != -1) {
			Contact user = info[index];
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
			// 그룹명이 회사 일때 와 거래처 그리고 기타로 구분 하여 update 할 수 있도록 한다.
			if (user.getGroup().equalsIgnoreCase("회사")) {
				CompanyContact c = (CompanyContact) info[index];
				System.out.println("회사명을 입력하세요.");
				System.out.print("> ");
				c.setCommpanyName(scanner.nextLine());
				System.out.println("부서명을 입력하세요.");
				System.out.print("> ");
				c.setDepartment(scanner.nextLine());

				System.out.println("직급을 입력하세요.");
				System.out.print("> ");
				c.setPosition(scanner.nextLine());
			} else if (user.getGroup().equalsIgnoreCase("거래처")) {
				CustomerContact c = (CustomerContact) info[index];
				System.out.println("거래처명을 입력하세요.");
				System.out.print("> ");
				c.setCustomer(scanner.nextLine());
				System.out.println("거래품목을 입력하세요.");
				System.out.print("> ");
				c.setItem(scanner.nextLine());
				System.out.println("직급을 입력하세요.");
				System.out.print("> ");
				c.setPosition(scanner.nextLine());
			} else {
				System.out.println("그룹을 입력해주세요.");
				System.out.print("> ");
				user.setGroup(scanner.nextLine());
			}

		} else {
			System.out.println("존재하지 않는 연락처 입니다.");
		}
	}

	public void delete() {
		System.out.println("삭제할 연락처의 이름을 입력해 주세요.");
		System.out.print("> ");
		String name = scanner.nextLine();
		int index = searchIndex(name);

		if (index > -1) {
			for (int i = index; i < numOfContact - 1; i++) {
				info[i] = info[i + 1];
			}
			numOfContact--;
			System.out.println("데이터가 삭제되었습니다.");
		} else {
			System.out.println("검색하신 이름의 데이터가 존재하지 않습니다.");
		}
	}

}
