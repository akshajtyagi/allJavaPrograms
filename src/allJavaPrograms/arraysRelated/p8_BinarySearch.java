package allJavaPrograms.arraysRelated;

import java.util.Arrays;

public class p8_BinarySearch {

	public static void main(String[] args) {
		
		// for Binary Search Array should be in sorted order
		int[] a = {10,20,40,50,80,60,30,70};
		
		// System.out.println(Arrays.binarySearch(a, 10)); --> built in method but array should be sorted first
		
		int key=700;
		int l=0;
		int h=a.length-1;
		
		boolean flag=false;
		
		//for(int i=0; i<=a.length-1; i++) 
		
		while(l<=h){
			
			int m=(l+h)/2;
			
			if(a[m]==key) {
				System.out.println("Found the value at index number: > " + m);
				flag=true;
				break;
			}
			
			if(a[m]<key) {
				l=m+1;
			}
			if(a[m]>key) {
				h=m-1;
			}
		}
		if(flag==false) {
			System.out.println("Element not found...");
		}
	
	}
}
