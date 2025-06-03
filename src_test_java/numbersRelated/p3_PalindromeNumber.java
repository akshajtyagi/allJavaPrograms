package numbersRelated;

import java.util.Scanner;

public class p3_PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number:");
		int num = sc.nextInt();	// 1234
		int org_num=num;
		
		int rev =0;
		
		while(num!=0) {
			rev = rev*10 +num%10;
			num=num/10;
		}
		System.out.println("Reverse of the given number is: >> "+ rev);
		
		if(org_num==rev) {
			System.out.println(org_num + " >> Palindrome number");
		}else {
			System.out.println(org_num + " >> Not a Palindrome number");
		}
	}
}
