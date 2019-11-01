package ch05.object.solveProblem2;

/*
 * 주문 객체
 */
public class Buyier {

	String name;
	int money;

	Buy buy;

	public Buyier(String name, int budget) {

		this(budget);
		this.name = name;
		this.buy = new Buy();
	}

	private Buyier(int budget) {

		this.money = budget;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
