package ch11.collectionFramework.list;

import java.util.ArrayList;

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");

		System.out.println(queue.deQueue()); // A
		System.out.println(queue.deQueue()); // B
		System.out.println(queue.deQueue()); // C
		queue.deQueue(); // 큐가 비어있습니다.
	}

}

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}

	public String deQueue() {
		int size = arrayQueue.size();
		
		// size check
		if (size == 0) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		// Queue :FIFO (First In First Out)
		return arrayQueue.remove(0);
	}
}