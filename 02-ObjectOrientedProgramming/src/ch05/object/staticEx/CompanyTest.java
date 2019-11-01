package ch05.object.staticEx;

public class CompanyTest {

	public static void main(String[] args) {

		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		// 2개가 가진 싱글톤 객체는 같은 주소를 가진다.
		System.out.println(company1);
		System.out.println(company2);

	}

}
