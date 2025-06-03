package allJavaPrograms.numbersRelated;

import java.util.Scanner;

public class p2_ReverseANumber {

public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the desired number: >>> ");
		int num = sc.nextInt(); 	//12345
		
		int rev = 0;
		
		while(num >0) {
			
		rev = rev*10 + num%10;
		num = num/10;
		}
		System.out.println("Reverse of the given number is: >>> "+ rev);
		*/
		
		// 2. by using StringBuffer/StringBuilder class
		/*
		int num1 = 12345;
		
		StringBuffer sf = new StringBuffer(String.valueOf(num1));
		StringBuffer rev1 = sf.reverse();
		System.out.println("Reverse of the given number is: >>> "+ rev1);
		*/
		
		// 3. by using StringBuilder class
		
		int num2 = 123456;
		StringBuilder sb = new StringBuilder();
		sb.append(num2);
		StringBuilder rev2 = sb.reverse();
		System.out.println("Reverse of the given number is: >>> "+ rev2);
		
	}

}
