package allJavaPrograms.starPattern;

public class StarPattern4 {
	public static void main(String[] args) {

		
		/*
		 	*****
		 	 ****
		 	  ***
		 	   **
		 	    *
		*/
		
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=2; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=row; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
