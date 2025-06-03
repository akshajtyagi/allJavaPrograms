package starPattern;

public class p14_DiamondPattern {

	public static void main(String[] args) {
		
		/*
		 
		         *
		        ***
		       *****
		      *******
		      *******
		       *****
		        ***
		         *
		 	// Diamond Pattern
		 */
		
		int n = 4;
		
		// for upper side
		for(int i=1; i<=n; i++) {
			
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		// for lower side
		for(int i=n; i>=1; i--) {
			
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=2; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}
}
