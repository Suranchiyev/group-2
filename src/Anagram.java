import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		System.out.println(isAnagram("listen", "silent")); // true
		System.out.println(isAnagram("abc", "bca")); // true
		System.out.println(isAnagram("abc", "ccb")); // false
		System.out.println(isAnagram("aaaacc", "aacccc")); // false
		
		System.out.println("-----------------");
		
		System.out.println(isAnagram2("listen", "silent"));
		System.out.println(isAnagram2("abc", "ccb"));
		System.out.println(isAnagram2("abc", "bcaa"));
		System.out.println(isAnagram2("triangle", "integral"));
		//System.out.println(isAnagram2("aaaacc", "aacccc")); // anagram2 is not best option
		
	}
	
	/**
	 *  isAnagram("listen", "silent") -> true
	 *  isAnagram("abc", "bca") 	  -> true
	 *  isAnagram("abc", "ccb") 	  -> false
	 *  
	 *  Time Complexity: O(n^2) - quadratic
	 */
	public static boolean isAnagram(String str, String str1) {
		// 1. sort both strings
		//    - convert both string to char[]
		//    - sort them
		// 2. compare them, if equal then its anagram
		
		char[] arrStr = str.toCharArray();
		char[] arrStr1 = str1.toCharArray();
		
		Arrays.sort(arrStr);
		Arrays.sort(arrStr1);
		
		return Arrays.equals(arrStr, arrStr1);
	}
	
	/**
	 *  Time Complexity: O(n) or O(n^2)
	 */
	public static boolean isAnagram2(String str, String str1) {
		
		if(str.length() != str1.length()) {
			return false;
		}
		
		for(int i = 0; i < str.length(); i++) {
			
			String letter = String.valueOf(str.charAt(i));
			if(!str1.contains(letter)) {
				return false;
			}
			
			letter = String.valueOf(str1.charAt(i));
			if(!str.contains(letter)) {
				return false;
			}
		}
		return true;
	}
}
