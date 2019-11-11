package ch09.interface_.practice;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println(" - R : 한명씩 차례대로");
		System.out.println(" - L : 대기가 적은 상담원 우선");
		System.out.println(" - P : 우선 순위가 높은 고객 우선 및 숙련도 높은 상담원 우선");

		Scheduler scheduler = null;// 인터페이스 타입으로 선언
		int ch = System.in.read(); // 입력을 받음

		switch (ch) {
		case 'R':
			scheduler = new RoundRobin();
			break;
		case 'L':
			scheduler = new LeastJob();
			break;
		case 'P':
			scheduler = new PriorityAllocation();
			break;
		default:
			System.out.println("지원되지 않는 기능입니다. 종료합니다.");
			System.exit(0);
		}

		// 인터페이스 타입으로 선언된 각 구현체클래스에서 구현한 기능을 호출
		// 기능의 명세만 보고 해당 기능을 호출하여 사용 가능함
		// 해당 기능의 내부가 어떻게 구성되어 있는지 몰라도 상관없이 유연한 사용 및 설계가 가능한 이유
		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
