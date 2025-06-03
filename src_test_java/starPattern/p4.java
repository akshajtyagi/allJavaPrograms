package starPattern;

public class p4 {

	public static void main(String[] args) {
		
		/*
		 	****
		 	***
		 	**
		 	*
		 
		 */
		
		int row = 4;
		
		for(int i=1; i<=row; i++) {
			
			for(int j=row; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
