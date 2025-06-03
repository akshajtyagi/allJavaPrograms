package starPattern;

public class p12_NumberPyramid {

	public static void main(String[] args) {
		
		/*
		 	    1
		 	   2 2
		 	  3 3 3
		 	 4 4 4 4
		 	5 5 5 5 5
		 	
		 */
		
		int n =5;
		
		for(int i=1; i<=n; i++) {
			//for spaces
			 for(int j=1; j<=n-i; j++) {
			//for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			 // it will print row numbers, row number of times
			for(int k=1; k<=i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
 