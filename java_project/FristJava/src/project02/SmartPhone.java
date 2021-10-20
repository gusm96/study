package project02;

import java.util.Scanner;
// 프로젝트-1 에서 정의한 Contact 클래스를 기반으로 아래 요구사항을 추가해서 프로그램을 작성 합니다.

//1.  SmartPhone 클래스를 정의합니다. 이 클래스는 연락처 정보를 관리하는 클래스입니다.
//①   Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//②   배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.

//2.  main()메소드를 아래의 요구조건을 정의해봅니다.
//①   SmartPhone 클래스의 인스턴스를 생성합니다.
//②   사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
//③   10번 반복해서 배열에 추가합니다.
//④   배열의 모든 요소를 출력합니다.
//⑤   배열의 모든 요소를 검색합니다.
//⑥   배열의 요소를 삭제해 봅시다.
//⑦   배열의 요소를 수정해 봅시다.
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
		System.out.print("> ");
		String group = scanner.nextLine();

		// 입력 받은 정보들을 add()메소드를 이용하여 배열에 저장
		add(new Contact(name, phoneNum, email, address, birthday, group));
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

			System.out.println("그룹을 입력해주세요.");
			System.out.print("> ");
			user.setGroup(scanner.nextLine());
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
