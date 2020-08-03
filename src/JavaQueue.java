import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
	public static void main(String[] args) {
		// Queue in Java represents a data structure desinged to have elements at
		// end of the queue and elements removed from the beginning
		// FIFO - First In, First Out
		
		// Queue has two implementations
		// 1. LinkedList
		// 2. PriorityQueue
		
		// What's the Queue?
		// It's FIFO - First In, First Out data structure
		
		// add() // offer()  -> add 
		// poll() -> remove
		
		
		Queue<String> queueInDunkin = new LinkedList<>();
		queueInDunkin.add("Alex");
		queueInDunkin.add("Misha");
		queueInDunkin.add("Boris");
		queueInDunkin.add("John"); // when Queue is full add() will fail and throw exception
		
		queueInDunkin.offer("Ari");
		queueInDunkin.offer("Meerim"); // when Queue is full offer() will fail throw 'false' exception
		
		System.out.println(queueInDunkin);
		
		System.out.println("-------------");
		
		// poll() method will return frist element from the queue
		String customer = queueInDunkin.poll();
		System.out.println("Completed order: " + customer);
		System.out.println("--------------");
		System.out.println("Costomers in line: " + queueInDunkin);
		
		System.out.println("---------------");
		
		customer = queueInDunkin.poll();
		System.out.println("Completed order: " + customer);
		System.out.println("--------------");
		System.out.println("Costomers in line: " + queueInDunkin);
		
	}
}
