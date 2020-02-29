package ch04.control_statement;

import java.util.Scanner;

/*
 * 조건문 if 예시 2
 */
public class Condition_if_3 {

	public static void main(String[] args) {

		System.out.println("Insert your age.");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;

		if (age < 8) {
			charge = 1000;
		} else if (age < 14) {
			charge = 1500;
		} else if (age < 20) {
			charge = 2000;
		} else {
			charge = 3000;
		}

		System.out.println("Age : " + age);
		System.out.println("Fee : " + charge);
		
		scanner.close();
	}

}
