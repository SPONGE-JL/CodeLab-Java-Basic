package ch13.errorHandling.practice;

public class IDFormat {

	private String userID;
	
	public void setUserID(String userID) throws IDFormatException {
		// 예외 발생
		if (userID == null)
			throw new IDFormatException("아이디는 null 일 수 없습니다.");
		else if (userID.length() < 8 || userID.length() > 20)
			throw new IDFormatException("아이디는 8자 이상 20자 이하여야 합니다.");
		
		// ID 저장
		this.userID = userID;
	}

	public String getUserID() {
		return userID;
	}

}
