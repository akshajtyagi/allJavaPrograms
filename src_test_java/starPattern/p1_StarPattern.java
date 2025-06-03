package starPattern;

import java.util.Scanner;

public class p1_StarPattern {

	public static void main(String[] args) {

		/*
		 
		 	*****
		 	*****
		 	*****
		 	*****
		 
		 // Solid Rectangle
		 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("provide the row count:");
		
		int row = sc.nextInt(); //4
		
		for(int i=1; i<=row; i++) {
			
			for(int j=1; j<=row+1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
