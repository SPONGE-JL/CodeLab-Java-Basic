package ch04.control_statement;

import java.util.Scanner;

/*
 * 조건문 switch-case 2
 */
public class Condition_switch_2 {

	public static void main(String[] args) {

		System.out.println("12개의 달중 1개를 입력하십시오.");

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt();
		int day = 22;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 2:
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		default:
			System.out.println("Error");
		}

		System.out.println(month + "/" + day);
	}

}
