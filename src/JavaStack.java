import java.util.Stack;

public class JavaStack {
	// Deque can behave as FIFO and LIFO 
	
	// Stack LIFO ( Last In, Last Out) data structure
	
	public static void main(String[] args) {
		Stack<String> messages = new Stack();
		// push() will add element on 'top' of the Stack
		messages.push("Message from: John");
		messages.push("Massage from: Alex");
		messages.push("Massages from: Smith");
		
		// pop() will get element from the top(last added) of Stack
		// it will remove this element
		
		String message = messages.pop();
		System.out.println(message);
		System.out.println(messages);
		
		System.out.println("---------");
		
		message = messages.pop();
		System.out.println(message);
		System.out.println(messages);
		
	}
}