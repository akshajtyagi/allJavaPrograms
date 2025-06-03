package arraysRelated;

public class p2_PrintEvenAndOddNumbersFromAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,3,5,4,8,7};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i<=arr.length-1; i++) {
			
			if(arr[i]%2==0) {
				System.out.println("Even numbers are: >> " + arr[i]);
				evenCount++;
			}
			else {
				System.out.println("Odd Numbers are: >> " + arr[i]);
				oddCount++;
			}
		}
		System.out.println("Even count: > "+evenCount);
		System.out.println("Odd Count: > "+oddCount);
		
		
//		// using enhanced for loop
//		for(int value:arr) {
//			if(value%2==0) {
//				System.out.println("Even numbers are: >> " + value);
//			}
//			else {
//				System.out.println("Odd numbers are: >> " + value);
//			}
//		}
		
	}
}
