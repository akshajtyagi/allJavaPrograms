package starPattern;

public class p6 {

	public static void main(String[] args) {
		
		/*
		 		1
		 		12
		 		123
		 		1234
		 		12345
		 		
		 		// Half Pyramid with numbers
		 */
		
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}
}
