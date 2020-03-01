package ch09.interface_.practice;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {

		Scheduler scheduler = null;// 인터페이스 타입으로 선언
		
		System.out.println("전화 상담원 할당 방식을 선택하세요.");
		System.out.println(" - R : 한명씩 차례대로");
		System.out.println(" - L : 대기가 적은 상담원 우선");
		System.out.println(" - P : 우선 순위가 높은 고객 우선 및 숙련도 높은 상담원 우선");

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

		scheduler.getNextCall();
		scheduler.sendCallToAgent();

	}

}
