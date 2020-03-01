package ch11.collectionFramework.list;

import java.util.ArrayList;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop()); // C
		System.out.println(stack.pop()); // B
		System.out.println(stack.pop()); // A
		stack.pop(); // 스택이 비어 있습니다.
	}

}

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {
		int size = arrayStack.size();
		
		// size check
		if (size == 0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		// Stack :LIFO (Last In First Out)
		return arrayStack.remove(--size);
	}
}