package starPattern;

public class p10_ButterflyPattern {

	public static void main(String[] args) {
		
		/*
		 
		 	*	   *
		 	**    **
		 	***  ***
		 	********
		 	********
		 	***  ***
		 	**    **
		 	*      *
		 		// Butterfly Pattern
		 */
		
		int n = 4;
		// for upper half
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//int spaces=2*(n-i);
			for(int k=1; k<=2*(n-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// for lower half
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			//int spaces=2*(n-i);
			for(int k=1; k<=2*(n-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
