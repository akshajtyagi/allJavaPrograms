package starPattern;

public class StarPattern5 {

	public static void main(String[] args) {
		
		/*
		 		*####
		 		**###
		 		***##
		 		****#
		 */
		
		
		int row = 4;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=row; k>=i; k--) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
