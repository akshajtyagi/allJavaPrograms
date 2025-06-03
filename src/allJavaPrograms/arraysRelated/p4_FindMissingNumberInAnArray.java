package allJavaPrograms.arraysRelated;

public class p4_FindMissingNumberInAnArray {

	public static void main(String[] args) {
		
		// Array should not have duplicate values
		// Array no need to be in sorted order
		// Values should be in proper range
		
		
		int[] a = {1,2,4,5};
		int sum1 = 0;
		
		for(int i=0; i<=a.length-1; i++) {
			sum1 = sum1+a[i];
		}
		
		int sum2 = 0;
		for(int i=1; i<=5; i++) {
			sum2=sum2+i;
		}
		int missingNumber = sum2-sum1;
		System.out.println("Missing number is: > "+ missingNumber);
		
	}
}
