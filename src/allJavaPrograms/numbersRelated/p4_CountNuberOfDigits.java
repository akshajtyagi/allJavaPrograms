package allJavaPrograms.numbersRelated;

import java.util.Scanner;

public class p4_CountNuberOfDigits {

	public static void main(String[] args) {
		
		//	Count Number of Digits in A Number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sc.nextInt();	// 123456789
		
		//int num = 145678;
		int digitCount = 0;
		
		while(num>0) {
			num=num/10;
			digitCount++;
		}
		System.out.println("Number of digits in the given number are: >> "+ digitCount);
	}
}
