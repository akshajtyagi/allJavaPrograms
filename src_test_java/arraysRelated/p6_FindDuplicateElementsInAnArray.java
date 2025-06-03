package arraysRelated;

import java.util.HashSet;

public class p6_FindDuplicateElementsInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,1,5,4};
		
		
//		// Approach 1
//		boolean flag = false;
//		for(int i=0; i<=arr.length-1; i++) {
//			
//			for(int j=i+1; j<=arr.length-1; j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println("Duplicate element is: > "+ arr[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("Duplicate element not found");
//		}
		
		
		// Approach 2: HashSet
		HashSet set = new HashSet();
		boolean flag=false;
		for(int t:arr) {
			if(set.add(t)==false) {
				System.out.println("Duplicate element is: > "+ t);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("Duplicate element not found");
		}
	}
}
