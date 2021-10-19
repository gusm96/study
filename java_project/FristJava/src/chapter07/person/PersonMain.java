package chapter07.person;

public class PersonMain  {
	public static void main(String[] args) { 
		Male m1 = new Male("이강인", "030819-3456789", "남자");
		Female f1 = new Female("김미영", "970830-2891919","여자");
		
		m1.greeting();
		f1.greeting();
	}
}
