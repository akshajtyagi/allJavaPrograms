package allJavaPrograms.arraysRelated;

import java.util.Arrays;

public class p3_CheckTwoArraysAreEqualOrNot {

	public static void main(String[] args) {
		
		int[] a1 = {1,2,4,5};
		int[] a2 = {1,2,3,5};
		
		//System.out.println(Arrays.equals(a1, a2));	// it will return true/false
		
//		// 1. first way
//		boolean status = Arrays.equals(a1, a2);
//		
//		if(status==true) {
//			System.out.println("Arrays are Equal.");
//		}else {
//			System.out.println("Arrays are not equal.");
//		}
		
		// 2. second way
		
		boolean status = true;
		
		if(a1.length==a2.length) {
			
			for(int i=0; i<=a1.length-1; i++) {
				if(a1[i] != a2[i]) {
					status=false;
				}
			}
		}else {
			status=false;
		}
		
		if(status==true) {
			System.out.println("Arrays are equal.");
		}else {
			System.out.println("Arrays are not Equal.");
		}
	}
}
