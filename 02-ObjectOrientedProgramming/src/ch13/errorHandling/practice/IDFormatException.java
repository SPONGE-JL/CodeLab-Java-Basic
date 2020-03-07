package ch13.errorHandling.practice;

// 사용자 정의 예외 구현
public class IDFormatException extends Exception {
	
	public IDFormatException(String messString) {
		super(messString);
	}

}
