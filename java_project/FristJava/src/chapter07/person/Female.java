package chapter07.person;

public class Female extends Person {
	String gender;

	public Female(String name, String rrn, String gender) {
		super(name, rrn);
		this.gender = gender;
	}

	@Override
	public void greeting() {
		super.greeting();
		System.out.println("제 직업은 " + gender + "입니다.");
	}

}
