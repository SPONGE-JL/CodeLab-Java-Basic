package ch05.object.classpart;

/**
 * 학생 정보를 담은 클래스
 */
public class Student {

	/**
	 * 학생 번호
	 */
	public int studentNo;

	/**
	 * 학생 이름
	 */
	public String studentName;

	/**
	 * 학생 주소
	 */
	public String studentAddress;

	/**
	 * 학생 정보 출력
	 */
	public void showStudentInfo() {

		System.out.println(studentName + "(" + studentNo + ")님은 '" + studentAddress + "'에 소속되어 있습니다.");

	}

}
