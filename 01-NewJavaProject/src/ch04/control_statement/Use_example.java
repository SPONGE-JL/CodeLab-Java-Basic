package ch04.control_statement;

/*
 * 제어문 종합 예시
 */
public class Use_example {

	public static void main(String[] args) {

		int goal = 1;

		for (int i = 0; i < 10; i++) {

			goal += i;

			while ((goal % 2) == 0) {

				goal += i;
				System.out.println("while	[ i : " + i + " ] goal : " + goal);

				if (goal > 10) {
					System.out.println("\n   * * * * * * * call continue! * * * * * * * \n");
					continue;
				}

			} // 내부 반복문 끝

			System.out.print("  for	[ i : " + i + " ] goal : " + goal);

			if (goal > 30) {
				break;
			}

			System.out.println("	|  no call break!");

		} // 외부 반복문 끝

		/*
		 	[결과]
		 	
			  for	[ i : 0 ] goal : 1	|  no call break!
			while	[ i : 1 ] goal : 3
			  for	[ i : 1 ] goal : 3	|  no call break!
			  for	[ i : 2 ] goal : 5	|  no call break!
			while	[ i : 3 ] goal : 11

		 		* * * * * * * call continue! * * * * * * * 

			  for	[ i : 3 ] goal : 11	|  no call break!
			  for	[ i : 4 ] goal : 15	|  no call break!
			while	[ i : 5 ] goal : 25

		 		* * * * * * * call continue! * * * * * * * 

			  for	[ i : 5 ] goal : 25	|  no call break!
			  for	[ i : 6 ] goal : 31
		 */
	}

}