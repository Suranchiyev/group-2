import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListReview {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add("kiwi");
		System.out.println(list);

		// reverse using Collections helper class
		Collections.reverse(list);
		System.out.println(list);

		// sort using Collection helper class
		Collections.sort(list);
		System.out.println(list);

		// What's the helper class for Array? Array -> Arrays.sort()
		// What's the helper class for collections framework? Collections ->
		// -- > Collections.sort(list), Collections.reverse();
	}
}