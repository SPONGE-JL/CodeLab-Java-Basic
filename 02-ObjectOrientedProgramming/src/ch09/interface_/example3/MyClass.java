package ch09.interface_.example3;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("X.java <~(extends)~ MyInterface <-(implements)- MyClass : x() 메서드");
	}

	@Override
	public void y() {
		System.out.println("Y.java <~(extends)~ MyInterface <-(implements)- MyClass : y() 메서드");
	}

}
