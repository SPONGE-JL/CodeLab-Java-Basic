package ch12.innerClass;

public class InnerTest {
	
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass(); // 외부클래스를 생성하면서 내부 클래스가 생성됨
		outClass.usingInclass(); // 외부클래스 메서드 호출하여 내부클래스 메서드 호출
		/*
			외부클래스 전역변수 num = 10
			내부클래스 지역변수 iNum = 100
		 */
		
		// 외부클래스 내부에서 쓰려고 사용한 내부클래스를 외부에서 생성하고자할 때 사용가능한 문법
		// 이러한 방식을 제한하고자 한다면, 내부클래스를 private로 선언하여 제한이 가능함
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		/*
			외부클래스 전역변수 num = 10
			내부클래스 지역변수 iNum = 100
		 */
		
		
		// 스태틱(정적)이므로 생성없이 접근가능
		OutClass.InStaticClass.inTest();
		/*
			외부 클래스의 스태틱 전역변수 sNum = 20
			내부 클래스의 스태틱 전역변수 sNum = 200
		 */
	}
}

//외부클래스
class OutClass {
	// 외부클래스의 지역변수
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass; // 내부클래스
	
	// 내부클래스는 외부클래스의 생성자에서 보통 함께 생성함
	public OutClass() {
		inClass = new InClass();
	}
	
	// 내부클래스 : 외부 클래스 생성시 함께 생성되므로 외부 클래스 생성 후 사용가능
	class InClass {
		int iNum = 100;
		// 내부클래스가 static으로 생성되지 않으면
		// 내부클래스의 static 변수는 허용되지 않는다.
		// static int sInNum = 200;
		
		void inTest() {
			System.out.println("외부클래스 전역변수 num = " + num);
			System.out.println("내부클래스 지역변수 iNum = " + iNum);
		}
	}
	
	// 외부클래스의 메소드로 내부클래스 호출
	public void usingInclass() {
		inClass.inTest();
	}
	
	// 스태틱(정적) 내부클래스 : 외부클래스 생성과 상관없이 접근가능
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		static void inTest() {
			System.out.println("외부 클래스의 스태틱 전역변수 sNum = " + sNum);
			System.out.println("내부 클래스의 스태틱 전역변수 sNum = " + sInNum);
		}
	}
}


/*
	TIP!

	DIR: CodeLab-JAVA-Basic/bin/ch12/innerClass
	- InnerTest.class
	- OutClass.class
	- Out$InClass.class
 */

