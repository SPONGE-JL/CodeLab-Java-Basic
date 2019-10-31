package ch05.object.cooperation;

public class Simulation {

	public static void main(String[] args) {

		// 학생
		Student devJRL = new Student("이정렬");

		// 잔액
		int remainMoney = devJRL.money;
		System.out.println(devJRL.name + " 님의 잔액 : " + devJRL.money); // 5000

		// 버스 탑승 후 잔액정보
		System.out.println("버스 탑승 >> ");
		remainMoney = devJRL.take.aBlueBus(remainMoney);
		devJRL.money = remainMoney;
		System.out.println(devJRL.name + " 님의 잔액 : " + devJRL.money); // 3950

		// 지하철 탑승 후 잔액정보
		System.out.println("지하철 탑승 >> ");
		remainMoney = devJRL.take.aGreeneBus(remainMoney);
		devJRL.money = remainMoney;
		System.out.println(devJRL.name + " 님의 잔액 : " + devJRL.money); // 2150

	}

}
