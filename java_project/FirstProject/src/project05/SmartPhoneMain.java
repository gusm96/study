package project05;

public class SmartPhoneMain {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		

		while (true) {
			System.out.println("1.연락처 저장 2. 전체 연락처 보기 3. 연락처 검색 4. 연락처 삭제 5. 연락처 수정 6.종료");
			int select = Contact.scanner.nextInt();

			switch (select) {
			case 1:
				System.out.println("연락처 저장");
				sp.insert();
				break;
			case 2:
				System.out.println("전체 연락처 보기");
				sp.printAll();
				break;
			case 3:
				System.out.println("연락처 검색");
				sp.searchInfo();
				break;
			case 4:
				System.out.println("연락처 삭제");
				sp.delete();
				break;
			case 5:
				System.out.println("연락처 수정");
				sp.update();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				SmartPhone.scanner.close();
				break;
			}
		}
	}

}
