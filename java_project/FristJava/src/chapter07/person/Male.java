package chapter07.person;

public class Male extends Person {
	String gender;

	public Male(String name, String rrn, String gender) {
		super(name, rrn);
		this.gender = gender;
	}

	@Override
	public void greeting() {

		super.greeting();
		System.out.println("제 성별은 " + gender + "입니다.");
		System.out.println();
	}

}
