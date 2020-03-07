package ch12.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ReduceTest {
	public static void main(String[] args) {
		
		String[] greetings = {
				"안녕하세요",
				"Hello",
				"おはようございます"
		};
		
		// Stream Reduce()를 초기값과 함께 람다식으로 구현한 경우 
		String resultLambda = Arrays.stream(greetings).reduce("init", (prevStr, nowStr) -> {
			if (prevStr.getBytes().length >= nowStr.getBytes().length)
				return nowStr;
			return prevStr;
		});
		System.out.println(resultLambda); // init
		
		// Stream Reduce()를 초기값없이 클래스와 메서드로 구현한 경우
		String resultMethod = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(resultMethod); // Hello
	}
}

// BinaryOperator<String>을 구현한 클래스
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String prevStr, String nowStr) {
		if (prevStr.getBytes().length >= nowStr.getBytes().length)
			return nowStr;
		return prevStr;
	}
	
}