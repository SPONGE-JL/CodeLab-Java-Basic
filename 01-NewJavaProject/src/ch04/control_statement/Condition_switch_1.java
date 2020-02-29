package ch04.control_statement;

import java.util.Scanner;

/*
 * 조건문 switch-case 1
 */
public class Condition_switch_1 {

	public static void main(String[] args) {

		System.out.println("등수(숫자)을 입력하세요.");

		Scanner scanner = new Scanner(System.in);

		int rank = scanner.nextInt();

		char medalColor = 'A';

		switch (rank) {
		case 1: // 상수, 정수, 문자 등의 값으로 사용 (JDK 1.7 이상)
			medalColor = 'G';
			System.out.println("금메달");
			break;
		case 2:
			medalColor = 'S';
			System.out.println("은메달");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("동메달");
			break;
		default:
			System.out.println("메달이 없습니다.");
		}

		System.out.println(rank + "등은 " + medalColor + "입니다.");

		scanner.close();
	}

}
