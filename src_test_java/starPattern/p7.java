package starPattern;

public class p7 {

	public static void main(String[] args) {
		
		/*
		 		12345
		 		1234
		 		123
		 		12
		 		1
		 	
		 	// Inverted half pyramid with numbers
		 */
		
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row-i+1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
