package starPattern;

public class p2_HollowRectanglePattern {

	public static void main(String[] args) {
		
		/*
		 
		 *****
		 *	 *
		 *	 *
		 *****
		 
		  //Hollow Pattern
		 
		 */
		
		int row = 4;
		int col = 5;
		
		for(int i=1; i<=row; i++) {
			
		for(int j=1; j<=col; j++) {
			
			if(i==1 || j==1 || i==row || j==col) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
		}
	}
}
