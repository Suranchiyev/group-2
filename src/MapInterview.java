import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapInterview {
	public static void main(String[] args) {
		String str = "helloool";
		//
		Map<String, Integer> letCount = countLetters(str);
		System.out.println(letCount);

		char[] letters = { 'a', 'b', 'a', 'c', 'd', 'a', 'c', 'e', 'e', 't' };
		Map<Character, Integer> charCount = charCount(letters);

		// {a=3, b=1, c=2, d=1, e=2, t=1}
		System.out.println(charCount);

	}

	public static Map<Character, Integer> charCount(char[] letters) {

		Map<Character, Integer> charsCount = new HashMap<>(); // if you want in order LinkedHashMap
		
//		for (int i = 0; i < letters.length; i++) {
//			Character ch = letters[i];
//
//			if (charsCount.containsKey(ch)) {
//				charsCount.put(ch, charsCount.get(ch) + 1);
//			} else {
//				charsCount.put(ch, 1);
//			}
//		}
		
		// Another way to do it
		for(Character ch : letters) {
			if(charsCount.containsKey(ch)) {
				charsCount.put(ch, charsCount.get(ch) + 1);
			}else {
				charsCount.put(ch, 1);
			}
		}
		
		
		return charsCount;
	}

	public static Map<String, Integer> countLetters(String str) {

		Map<String, Integer> lettersCount = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			String letter = String.valueOf(str.charAt(i));

			if (lettersCount.containsKey(letter)) {
				lettersCount.put(letter, lettersCount.get(letter) + 1);
			} else {
				lettersCount.put(letter, 1);
			}

		}
		

		return lettersCount;
	}
}
