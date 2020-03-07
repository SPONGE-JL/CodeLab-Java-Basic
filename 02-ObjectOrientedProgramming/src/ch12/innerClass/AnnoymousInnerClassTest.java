package ch12.innerClass;

public class AnnoymousInnerClassTest {
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Runnable runnable = outer2.getRunnable(10);
		runnable.run();
		/*
		 	100
			100
			200
		 */
	}
}

// 외부클래스
class Outer2 {
	int outNum = 100;
	static int sNUm = 200;
	
	/*
	 * 인스턴스를 생성할때 익명 클래스를 사용하는 예제 (안드로이드에서 많이 사용)
	 */
	Runnable runner = new Runnable() {
		int num = 100;
		@Override
		public void run() {
			System.out.println(num); // 메서드 지역변수 접근가능 (변경 불가능)
			System.out.println(outNum); // 메서드 외부의 클래스 전역변수 접근가능
			System.out.println(Outer.sNUm); // 클래스를 지정하여 전역변수 접근가능
		}
	};
	
	/*
	 * 메소드로 익명 클래스를 사용하여 객체를 리턴하는 예제
	 */
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {
			// 익명 클래스
			@Override
			public void run() {
				System.out.println(num); // 메서드 지역변수 접근가능 (변경 불가능)
				System.out.println(outNum); // 메서드 외부의 클래스 전역변수 접근가능
				System.out.println(Outer.sNUm); // 클래스를 지정하여 전역변수 접근가능
			}
		};
	}
}