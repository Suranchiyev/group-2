import java.util.LinkedHashSet;  
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println(removeDup("apple"));
		System.out.println(removeDup("hello"));
		System.out.println(removeDup("aaaa"));
		
		System.out.println("---------------");
		System.out.println(removeDup2("apple"));
		System.out.println(removeDup2("hello"));
		System.out.println(removeDup2("aaaa"));
		
	}
	
	/**
	 *  removeDup("apple") -> "aple"
	 *  removeDup("hello") -> "helo"
	 *  removeDup("aaaa")  -> "a"
	 *  
	 *  Time Complexity: O(n) - linear
	 * 
	 */
	public static String removeDup(String str) {
		String strNoDup = "";
		
		Set<Character> set = new LinkedHashSet<>();
		
		// add each letter to set. It will remove duplicates because of Set does allowed duplicates
		for(char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		// put it back to String from Set
		for(Character ch : set) {
			strNoDup += ch;
		}
		
		return strNoDup;
	}
	
	/**
	 *  removeDup2("apple") -> "aple"
	 *  removeDup2("hello") -> "helo"
	 *  removeDup2("aaaa")  -> "a"
	 *  
	 *  Time Complexity: O(n^2) - O(n) 
	 * 
	 */
	public static String removeDup2(String str) {
		String noDupStr = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			String letter = String.valueOf(str.charAt(i));
			
			if(!noDupStr.contains(letter)) {
				noDupStr += letter;
			}
		}
		
		return noDupStr;
	}
}
