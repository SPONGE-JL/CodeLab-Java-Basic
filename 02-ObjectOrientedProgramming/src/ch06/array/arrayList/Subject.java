package ch06.array.arrayList;

/*
 * 참조 객체 : 과목
 */
public class Subject {

	private String name;
	private int score;

	public Subject() {

	}

	public Subject(String name, int score) {
		setName(name);
		setScore(score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
