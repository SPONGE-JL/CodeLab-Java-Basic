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
class GenericPrinter<T> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
}

class Plastic {
	public String toString() {
		return "재료는 플라스틱입니다.";
	}
}

class Powder {
	public String toString() {
		return "재료는 파우더입니다.";
	}
}