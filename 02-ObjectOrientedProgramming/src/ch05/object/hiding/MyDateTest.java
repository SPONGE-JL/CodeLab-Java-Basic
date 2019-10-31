package ch05.object.hiding;

public class MyDateTest {

	public static void main(String[] args) {

		// public으로 선언된 클래스는 어디서든 참조 가능
		MyDate date = new MyDate();

		// 접근제어자가 없는 멤버변수에 대해서는 같은 패키지에서 접근이 가능
		date.day = 30;
		date.month = 10;
		date.year = 2019;

		// private으로 선언된 멤버변수는 클래스 내부에서만 참조 가능
		// 클래스 내부의 private를 변경하는 public 메소드를 제공
		date.setPrivNum(99);
		int getNum = date.getPrivNum();

		System.out.println("public 메소드로 private 멤버변수를 읽어온 결과 값 : " + getNum); // 99

	}

}
