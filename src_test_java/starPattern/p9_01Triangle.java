package starPattern;

public class p9_01Triangle {

	
	public static void main(String[] args) {
		
		/*
		 
		 		1
		 		0 1
		 		1 0 1
		 		0 1 0 1
		 		1 0 1 0 1
		 		
		 		// 0-1 Triangle
		 */
		
		int row = 5;
		
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i; j++) {
				int sum = i+j;
					if(sum%2==0) {
						System.out.print("1 ");
					}else {
						System.out.print("0 ");
					}
			}
			System.out.println();
		}
		
		
	}
}
