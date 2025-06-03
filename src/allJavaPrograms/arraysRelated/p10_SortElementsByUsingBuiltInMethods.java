package allJavaPrograms.arraysRelated;

import java.util.Arrays;
import java.util.Collections;

public class p10_SortElementsByUsingBuiltInMethods {

	public static void main(String[] args) {
		
		int[] a = {4,5,1,2,3};
		
		System.out.println("Arrays elements before sorting: > " + Arrays.toString(a));
		
//		//Approach1
//		Arrays.parallelSort(a);
//		System.out.println("Arrays elements after sorting: > " + Arrays.toString(a));
		
		
//		//Approach2
//		Arrays.sort(a);
//		System.out.println("Arrays elements after sorting: > " + Arrays.toString(a));
		
		
		//Approach3 (sorted in Descending order)
		Integer [] a1 = {4,5,1,2,3};
		
		Arrays.sort(a1, Collections.reverseOrder());
		System.out.println("Arrays elements after sorting: > " + Arrays.toString(a1));
		
	}
}
