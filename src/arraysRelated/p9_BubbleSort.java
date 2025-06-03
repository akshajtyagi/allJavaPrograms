package arraysRelated;

import java.util.Arrays;

public class p9_BubbleSort {

public static void main(String[] args) {
		
		int[] a = {5, 7, 3, 6, 2, 1, 4};
		
		System.out.println("Array before sorting >>> " + Arrays.toString(a) + "\n");
		
			for(int i=0; i<a.length-1; i++) {	// number of passes
				
				for(int j=0; j<a.length-1; j++) {	// iterations in each pass
					
					if(a[j]>a[j+1]) {
						
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
		System.out.println("Array after sorting >>> " + Arrays.toString(a) + "\n");
		
		System.out.println("Lowest number is >>> " + a[0] + "\n");
		System.out.println("Highest number is >>> " + a[a.length-1] + "\n");
		System.out.println("Second Highest is >>> " + a[a.length-2]);
	}
}
