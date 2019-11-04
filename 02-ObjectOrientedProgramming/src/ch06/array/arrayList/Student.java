package ch06.array.arrayList;

import java.util.ArrayList;

/*
 * 학생 객체
 */
public class Student {

	// 학생 정보
	int studentID;
	String studentName;

	// 학생이 가지는 과목전체 정보
	ArrayList<Subject> subjectList;

	public Student(int studentID, String studentName) {

		this.studentID = studentID;
		this.studentName = studentName;

		this.subjectList = new ArrayList<Subject>();

	}

	public void addSubject(String name, int score) {
		// 과목 객체에 과목점수를 넣어서 초기화
		Subject subject = new Subject(name, score);

		// 초기화된 과목을 학생객체가 가진 과목리스트에 추가
		subjectList.add(subject);

	}

	public void showStudentInfo() {

		int total = 0;

		System.out.println("ID : " + studentID);
		System.out.println("이름 : " + studentName);
		System.out.println("------------");

		for (Subject subject : subjectList) {

			System.out.println(subject.getName() + " : " + subject.getScore());
			total += subject.getScore();
		}

		System.out.println("------------");
		System.out.println("총점 : " + total);

	}
}
