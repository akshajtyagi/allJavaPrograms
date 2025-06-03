package arraysRelated;

public class p1_SumOfElementsInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4};
		int sum = 0;
		
		for(int i=0; i<=arr.length-1; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of the Elements in the given Array is: >> " + sum);
		
		
//		// using enhanced for loop
//		for(int value:arr) {
//			sum=sum+value;
//		}
//		
//		System.out.println("Sum of the Elements in the given Array is: >> " + sum);
		
	}
}
