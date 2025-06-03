package allJavaPrograms.numbersRelated;

public class p5_NumberOfEvenAndOddDigitsInANumber {

	public static void main(String[] args) {
		
		// Count Number of EVEN & ODD Digits in A Number
		
		int num = 145678;
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0) {
			
			int rem = num%10;
			
			if(rem%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Even count: >> " + evenCount);
		System.out.println("Odd count: >> " + oddCount);
	}
}
