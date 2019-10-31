package ch05.object.solveProblem1;

public class Question1_run {

	public static void main(String[] args) {

		Question1 question = new Question1();

		question.age = 40;
		question.name = "James";
		question.gender = "남자";
		question.isMarried = true;
		question.childrenCount = 3;

		question.print();

		/*
		 * 나이 : 40 이름 : James 이름 : James 성별 : 남자 결혼여부 : true 자녀 수 : 3
		 */

	}

}
