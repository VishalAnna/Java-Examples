package javapractice;

import java.util.Arrays;

public class AnagramChecker {
	
	public static boolean areAnagram(String str1, String str2) {
		str1 = str2.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();
		
		if (str1.length() != str2.length()) {
			return false;
		}
		char[] charArray1 =str1.toCharArray();
		char[] charArray2 =str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}
	

	public static void main(String[] args) {
		String[][] testCases = {
				{"listen", "silent"},
				{"Hello" , "Val" },
				{"Ddormitory", "Dirty room"},
				{"Apple", "Pale"}
		};
		
		for(String[] pair : testCases) {
			System.out.printf(" '%s' and '%s' are anagrams ? %b %n" , pair[0], pair[1], areAnagram(pair[0], pair[1]));
		}
	}

}
