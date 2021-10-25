package project04;

//②   CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스를 정의합니다. 

//		- 거래처회사이름, 거래품목, 직급 변수 추가
//		- 정보를 출력하는 메소드를 오버라이딩 해서 추가된 정보를 추가해서 출력

public class CustomerContact extends Contact {
	String customer;
	String item;
	String position;
	

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public CustomerContact(String name, String phoneNum, String email, String address, int birthday, String group,
			String customer, String item, String position) {
		super(name, phoneNum, email, address, birthday, group);
		this.customer = customer;
		this.item = item;
		this.position = position;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("거래처회사이름: " + customer);
		System.out.println("거래품목: " + item);
		System.out.println("직급: " + position);
	}

}
