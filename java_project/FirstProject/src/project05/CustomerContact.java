package project05;

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
