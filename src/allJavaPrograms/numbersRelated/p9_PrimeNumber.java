package allJavaPrograms.numbersRelated;

public class p9_PrimeNumber {

	public static void main(String[] args) {

		// 1. any natural number which is greater than 1 (>1)
		// 2. which has only two factors 1 and itself
		// e.g: 2,3,5,7,11,13,17,19....

		int num = 1;
		int count = 0; // count should be 2 only

		if (num > 1) {

			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(num + " >> Prime Number");
			} else {
				System.out.println(num + " >> Not a Prime Number");
			}

		} else {
			System.out.println("Provide a valid number. !!! To check the prime number the number should be >1 !!!");
		}

	}
}
