package ch12.lambda;

// '람다식을 위한 인터페이스'임을 명시
@FunctionalInterface
public interface MyMaxNumber {
	// 함수형 인터페이스는 '단 하나의 메서드' 명세만 허용
	int getMaxNumber(int x, int y);
}
