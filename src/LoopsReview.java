public class LoopsReview {
	public static void main(String[] args) {

		boolean b = false;
		
		// while loop migth have 0 iterations
		while (b) { // it will print when only true. now it will not print cause b = false.
			System.out.println("Hello");
			break;
		}

		// do while loop will have at least one iteration 
		do {    // it will print one iteration cause do while loop print first iteration and
				// then it will check condition
			System.out.println("Hello, World!");
		} while (b);

	}
}