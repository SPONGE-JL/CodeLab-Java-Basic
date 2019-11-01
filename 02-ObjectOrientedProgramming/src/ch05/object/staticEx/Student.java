package ch05.object.staticEx;

/*
 * static 예제 
 */
public class Student {

	// 인스턴스 생성시 초기화되는 변수를 static으로 하여
	// 모든 객체에서 접근 가능한 데이터 영역에 고정한 뒤
	// 모두 동일한 객체를 바라보고자 할 때 사용
	public static int serialNum = 1000;

	public Student() {

		serialNum++;

		// 인스턴스를 생성하는 호출스택(callStack)에 각 인스턴스의 스택메모리가 생성되고,
		// 인스턴스 생성을 위하 호출되면 생성자가 호출되므로 힙 메모리에 실제 메모리를 각자 점유
		// 이때, 인스턴스 내부의 멤버변수가 static일때,
		// 서로 다른 인스턴스는 데이터 영역(static 영역)에 static 변수를 저장한다.

	}
	// 여기서 한 가지 주의할 점은, static은 인스턴스 생성과 무관하게,
	// 애플리케이션이 구동될 때 이미 static 메모리 영역에 점유하여 정지할 때 까지 점유한다.

	// 반면,
	// 다른 멤버변수 (전역변수)는 인스턴스로 heap 메모리에 생성되었을 때 사용 가능하며,
	// priavate가 아닌 멤버변수에 한하여 인스턴스를 통해 변수접근이 가능하다.
	// 해당 인스턴스를 생성한 코드블럭의 수행이 완전히 끝나면
	// 힙 메모리의 인스턴스 메모리를 가비지 컬렉터(GC)가 소거한다.

	// 마지막으로,
	// 함수 내부에서 선언되는 로컬변수 (전역변수)는 함수의 호출떄 stack 메모리 영역에서 생성되고,
	// 함수 호출이 끝나면 함수의 소멸과 함께 메모리가 소거된다.
}
