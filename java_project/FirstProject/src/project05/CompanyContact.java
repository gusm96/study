package project05;

public class CompanyContact extends Contact {
	String commpanyName;
	String department;
	String position;
	

	public String getCommpanyName() {
		return commpanyName;
	}

	public void setCommpanyName(String commpanyName) {
		this.commpanyName = commpanyName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public CompanyContact(String name, String phoneNum, String email, String address, int birthday, String group,
			String commpanyName, String department, String position) {
		super(name, phoneNum, email, address, birthday, group);
		this.commpanyName = commpanyName;
		this.department = department;
		this.position = position;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("회사명: " + commpanyName);
		System.out.println("부서명: " + department);
		System.out.println("직급: " + position);
	}

}
