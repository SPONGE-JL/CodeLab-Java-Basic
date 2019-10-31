package ch05.object.hiding;

/*
 * this 예시
 */
public class ThisExample {

	String name;
	int age;

	public ThisExample() {

		// 자기 자신의 다른 생성자를 호출
		this("이름없음", 10);
		// 생성자 내부에서 반드시 제일 먼저 수행되어야함
		// 생성자가 다른 생성자를 호출할 때 주석 외의 다른 수행으로 값변조를 불허

	}

	public ThisExample(String name, int age) {

		// this는 자기 자신의 메모리주소값을 반환함
		// 반환된 메모리주소값을 가지고 멤버변수/메소드 접근(참조)
		this.name = name;
		this.age = age;

	}

}
