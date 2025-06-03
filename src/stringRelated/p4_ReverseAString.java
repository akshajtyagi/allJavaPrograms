package stringRelated;

public class p4_ReverseAString {

	// reverse a string without using inbuilt method

	public static void main(String[] args) {

		String str = "MadaM";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println("Reverese of the given String is: >>> " + rev + "\n");

		if (str.equalsIgnoreCase(rev)) {

			System.out.println("It is a Palindrome String");
		} else {

			System.out.println("It is Not a Palindrome String");
		}

		// 2. using StringBuffer class
		StringBuilder sbRev = new StringBuilder(str).reverse();
		System.out.println("Reverse of the given string is: >>> " + sbRev);

		// if we want to check whether given string is Palindrome or not
		String sbRev1 = new StringBuilder(str).reverse().toString();
		System.out.println("Reverse of the given string is: >>> " + sbRev + "\n");
		System.out.println("Is Palindrome: >>> " + str.equalsIgnoreCase(sbRev1));

		// 3. using toCharArray
		System.out.println("************************");

		String s2 = "tss";
		String rev2 = "";
		char[] c = s2.toCharArray();

		for (int k = c.length - 1; k >= 0; k--) {
			rev2 = rev2 + c[k];
		}
		System.out.println(rev2);
	}
}
