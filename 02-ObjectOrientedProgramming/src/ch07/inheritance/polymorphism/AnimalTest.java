package ch07.inheritance.polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}

	public void flying() {
		System.out.println("독수리가 날아오릅니다.");
	}
}

/*
 * 모두 Animal인 클래스들을 이용한 다형성의 기초 예제
 */
public class AnimalTest {

	/*
	 * 여러 클래스를 하나의 타입으로 상속/구현해서 하나의 동일한 이름의 메소드를 상속받고, 다양한 결과를 수행하도록 만들어 내는 다형성
	 */
	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {

		// UpCasting(업 캐스팅) : 상위 타입으로 선언하여 초기화하는 묵시적 형변환
		Animal aniHuman = new Human();
		Animal aniTiger = new Tiger();
		Animal aniEagle = new Eagle();

		AnimalTest test = new AnimalTest();
		test.moveAnimal(aniHuman); // 사람이 두발로 걷습니다.
		test.moveAnimal(aniTiger); // 호랑이가 네발로 뜁니다.
		test.moveAnimal(aniEagle); // 독수리가 하늘을 납니다.

		System.out.println("");

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(aniHuman);
		animalList.add(aniTiger);
		animalList.add(aniEagle);

		for (Animal animal : animalList) {
			animal.move();
		}
		// 사람이 두발로 걷습니다.
		// 호랑이가 네발로 뜁니다.
		// 독수리가 하늘을 납니다.

		System.out.println("");

		/////////////////////////////////////////////////////////////////////////////////////////////

		// [오류예시1] 아래 인스턴스는 Animal 타입에서는 메소드를 호출할 수 없습니다.
		// aniHuman.readBooks();

		// [오류예시2] 아래 인스턴스는 명시적 형변환을 하였더라도 자바는 수행할 수 없습니다.
		// Eagle eagle = (Eagle) aniHuman;
		// 에러코드
		// Exception in thread "main" java.lang.ClassCastException:
		// ch07.inheritance.polymorphism.Human cannot be cast to ch07.inheritance.polymorphism.Eagle
		// at ch07.inheritance.polymorphism.AnimalTest.main(AnimalTest.java:87)
		
		/////////////////////////////////////////////////////////////////////////////////////////////
		
		// 이를 해결하기 위하여 instancof 연산자를 사용합니다.
		for (Animal animal : animalList) {
			// 인스턴스 타입체크
			if(animal instanceof Human) {
				// DownCasting(다운 캐스팅) : 하위 타입으로 명시하여 형변환
				((Human) animal).readBooks();
			} else if (animal instanceof Tiger) {
				((Tiger) animal).hunting();
			} else if (animal instanceof Eagle) {
				((Eagle) animal).flying();
			}
		}
		// 사람이 책을 읽습니다.
		// 호랑이가 사냥을 합니다.
		// 독수리가 날아오릅니다.

	}
}
