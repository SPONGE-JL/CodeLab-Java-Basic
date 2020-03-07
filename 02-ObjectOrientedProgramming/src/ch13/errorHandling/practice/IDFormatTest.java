package ch13.errorHandling.practice;

public class IDFormatTest {

	public static void main(String[] args) {

		IDFormat idform = new IDFormat();
		String myId = null;

		// ID가 Null일떄 오류
		try {
			idform.setUserID(myId);
		} catch (Exception e) {
			System.out.println(e);
			// ch13.errorHandling.practice.IDFormatException: 아이디는 null 일 수 없습니다.
		}

		// ID가 8자 미만일때 오류
		try {
			myId = "java";
			idform.setUserID(myId);
		} catch (Exception e) {
			System.out.println(e);
			// ch13.errorHandling.practice.IDFormatException: 아이디는 8자 이상 20자 이하여야 합니다.
		}
	}
}
