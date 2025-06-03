package starPattern;

public class p13_PalindromePattern {

	public static void main(String[] args) {
		
		/*
		 
		        1
		      2 1 2
		    3 2 1 2 3
		  4 3 2 1 2 3 4
		5 4 3 2 1 2 3 4 5
		 
		 // Palindrome Pattern
		 */
		
		int n = 5;
		
		for(int i=1; i<=n; i++) {
			
			// for spaces
			// for(int j=1; j<=n-i; j++) {
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			
			// for 1st half
			for(int k=i; k>=1; k--) {
				System.out.print(k);
			}
			
			// for 2nd half
			for(int j=2; j<=i; j++) {	// if want to print 1 two times then just start j=1
				System.out.print(j);
			}
			System.out.println();
			
		}
	}
	
}
