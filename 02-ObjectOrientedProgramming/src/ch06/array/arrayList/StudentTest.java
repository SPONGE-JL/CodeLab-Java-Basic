package ch06.array.arrayList;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);

		Student studentKim = new Student(1002, "Kim");
		studentKim.addSubject("국어", 100);
		studentKim.addSubject("수학", 95);
		studentKim.addSubject("영어", 80);

		studentLee.showStudentInfo();
		/*
			ID : 1001
			이름 : Lee
			------------
			국어 : 100
			수학 : 90
			------------
			총점 : 190
		 */
		
		System.out.println("");
		
		studentKim.showStudentInfo();
		/*
			ID : 1002
			이름 : Kim
			------------
			국어 : 100
			수학 : 95
			영어 : 80
			------------
			총점 : 275
		 */
	}

}
