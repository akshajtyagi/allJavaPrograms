package starPattern;

public class p3_HalfPyramid {

	public static void main(String[] args) {
		
		/*
		 	*
		 	**
		 	***
		 	****
		 	
		 // Half Pyramid
		 */
		
		
		int row = 4;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
