package com.openclassrooms;

public class PermutationSolution {

	public static void main(String[] args) {
		// Confirm Assumptions
		// Assumptions: (1) Case Sensitive "God" is permutation of "god"
		//              (2) Whitespace is significant "god     " is different from "dog"
		//              (3) ASCII character set: a - 97 b - 98 c- 99 and A - 65 B - 66 C- 67
		
		System.out.println(permutation2("abc","bac"));
		
	}
	
	
	// Solution 1: Sort the strings
	public static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	public static boolean permutation(String s, String t) {
		// Time: O(n*logn) 
		if(s.length() != t.length()) {
			return false;
		}
		return sort(s).equals(sort(t));
	}
	

	// Solution 2: Identical Character Counts 
	// Count each character and traverse the two arrays
	// Time: O(n)  Space: O(n)
	public static boolean permutation2(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		//ASCII has 128 characters 2^7
		int[] letters = new int[128]; // Assumption
		
		char[] s_array = s.toCharArray();
		for(char c: s_array) {
			System.out.println(c + " : " + (int)c);
			letters[(int)c]++;
		}
		
		
		
		// Loop through characters in second string "t"

		for(int i = 0; i <t.length(); i++) {
			int c = (int) t.charAt(i);
			letters[c]--;
			if(letters[c] < 0) {
				return false;
			}
		}
		
		
		return true;
		
	}
	
}
