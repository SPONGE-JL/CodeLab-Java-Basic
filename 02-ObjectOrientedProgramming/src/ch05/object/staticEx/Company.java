package ch05.object.staticEx;

public class Company {

	// 외부에서 접근 불가능하고 유일한 싱글톤 객체
	private static Company singletonComapy = new Company();

	// 외부에서 생성할 수 없는 생성자
	private Company() {

	}

	// 외부에서 인스턴스 생성없이 접근가능한 static 메소드를 통해서
	// 클래스 내부에 생성된 싱글톤 객체를 접근하여 유일한 싱글톤 객체를 반환받기 위한 용도
	public static Company getInstance() {

		if (singletonComapy == null) {
			singletonComapy = new Company();
		}

		return singletonComapy;

	}

}
