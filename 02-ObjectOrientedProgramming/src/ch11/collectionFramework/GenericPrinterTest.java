package ch11.collectionFramework;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter); // 재료는 플라스틱입니다.

		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter); // 재료는 파우더입니다.
	}
}

// 제네릭 타입(매개변수 타입)으로 생성된 3D프린터 객체
// T에서 사용할 자료형을 제한하기 위핸 extends 적용가능 (유연한 설계)
class GenericPrinter<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.doPringting();
	}
}

// T를 제한하기위한 추상 클래스
abstract class Material {
	public abstract String doPringting();
}

class Plastic extends Material {
	public String toString() {
		return "재료는 플라스틱입니다.";
	}

	@Override
	public String doPringting() {
		return "제네릭 출력! 플라스틱 제품이 생산되었습니다.";
	};
}

class Powder extends Material {
	public String toString() {
		return "재료는 파우더입니다.";
	}

	@Override
	public String doPringting() {
		return "제네릭 출력! 파우더 제품이 생산되었습니다.";
	};
}