package chapter08.exception;

//	1.콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인하는 프로그램을 만들어봅시다.
//
//	①사용자 예외 클래스를 정의해서 예외를 발생 시켜 봅시다.
//
//	②예외 클래스 이름은 BadIdInputException이라고 정의합시다.
//
//	2.Scanner 클래스로 태어난 년도를 입력 받을 때 int 타입으로 받도록 합시다. 
//	    이때 nextInt() 메소드를 사용하게 되는데 이때 발생하는 예외처리를 하도록 합시다.
public class BadIdInputException extends Exception {

	public BadIdInputException(String message) {
		super("입력하신 아이디 " + message + "에 영문자와 숫자 이외는 문자가 포함되어 있습니다. ");
	}

}
