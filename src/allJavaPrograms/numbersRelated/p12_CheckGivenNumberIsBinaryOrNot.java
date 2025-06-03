package allJavaPrograms.numbersRelated;

import java.util.Scanner;

public class p12_CheckGivenNumberIsBinaryOrNot {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        boolean isBinary = true;

        for (int i = 0; i < number.length(); i++) {
            char digit = number.charAt(i);
            if (digit != '0' && digit != '1') {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println("The number is binary.");
        } else {
            System.out.println("The number is NOT binary.");
        }

        scanner.close();
    }
	
}
