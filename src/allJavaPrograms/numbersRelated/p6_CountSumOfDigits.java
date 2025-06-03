package allJavaPrograms.numbersRelated;

public class p6_CountSumOfDigits {

	public static void main(String[] args) {

		// Count Sum of Digits in a Number

		int num = 1234;
		int sum = 0;

		while (num > 0) {

			sum = sum + num % 10;
			num = num / 10;

		}
		System.out.println("Sum of the given digits: >> " + sum);
	}
}
