package ch12.innerClass;

public class LocalInnerClassTest {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(10);
		runnable.run();
		/*
		 	100
			100
			200
		 */
	}
}

// 외부클래스
class Outer {
	int outNum = 100;
	static int sNUm = 200;
	
	// 내부클래스를 가지는 메소드
	Runnable getRunnable(int i) {
		int num = 100;
		// 메서드 내부 클래스 (유효성이 짧으므로 클래스내부에서 메서브 변수는 상수취급)
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				System.out.println(num); // 메서드 지역변수 접근가능 (변경 불가능)
				System.out.println(outNum); // 메서드 외부의 클래스 전역변수 접근가능
				System.out.println(Outer.sNUm); // 클래스를 지정하여 전역변수 접근가능
			}
		}
		
		return new MyRunnable();
	}
}