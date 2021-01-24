public class LoopsReview2 {
	public static void main(String[] args) {
		// for loop
		// we use for loop when we know exact iterations

		// for(declarationPart; conditionPart; UpdatePart) {
		//
		// }

		//
		for (int i = 0; i < 5; i++) {
			System.out.println("HELLO" + " " + i);
		}

		// 1.....1000
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// 1000......1
		for (int i = 1000; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		// 1......1000 every 5 numbers
		for (int i = 0; i <= 1000; i += 5) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		String str = "hello, Im John Doe";
		// letter 'o'

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'o') {
				continue;
			}
			System.out.print(str.charAt(i)); // hell, Im Jhn De
		}

		System.out.println("\n");

		String[] names = { "Smith", "John", "Alex", "Kuba" };
		for (String name : names) {
			System.out.println(name.toUpperCase());
			System.out.println("Alisher REviewed");
		}

	}
}
