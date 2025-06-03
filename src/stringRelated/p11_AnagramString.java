package stringRelated;

import java.util.Arrays;

public class p11_AnagramString {

	public static void main(String[] args) {
		
		String s1 = "Listen";
		String s2 = "Silent";
		
		s1=s1.replaceAll(" ", "").toLowerCase();
		s2=s2.replaceAll(" ", "").toLowerCase();
		
		char[] c =	s1.toCharArray();
		char[] c1 = s2.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		
		boolean result = Arrays.equals(c, c1);
		
		if(result==true) {
			System.out.println("Strings are Anagram");
		}else {
			System.out.println("Strings are not Anagram...");
		}
	}
}
