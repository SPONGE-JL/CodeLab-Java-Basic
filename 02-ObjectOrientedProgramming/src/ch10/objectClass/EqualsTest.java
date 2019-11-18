package ch10.objectClass;

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = new String("abc");

		System.out.println("'=='은 메모리 주소를 비교합니다. --> " + (str1 == str2)); // false
		System.out.println("'eqauls'은 값이 같은지 비교합니다. --> " + (str1.equals(str2))); // true

		Student Lee1 = new Student(100, "이순신");
		Student Lee2 = Lee1;
		Student Lee3 = new Student(100, "이순신");

		System.out.println(Lee1 == Lee3);
		System.out.println(Lee1.equals(Lee3));

		System.out.println("-------------------");

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		System.out.println(i1 == i2); // false
		System.out.println(i1.equals(i2)); // truee
		System.out.println(i1.hashCode()); // 100
		System.out.println(i2.hashCode()); // 100

	}

}

class Student {
	int studentNum;
	String studentName;

	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student std = (Student) obj;
			return (this.studentNum == std.studentNum);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

}