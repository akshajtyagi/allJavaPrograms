package starPattern;

public class p11_SolidRhombus {

	public static void main(String[] args) {
		
		/*
		 
		 		    *****
		 		   *****
		 		  *****
		 		 *****
		 		*****	
		 
		 // Solid Rhombus
		 */
		
		int n =5;
		
		for(int i=1; i<=n; i++) {
			
			 //for(int j=1; j<=n-i; j++){
			for(int j=n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
