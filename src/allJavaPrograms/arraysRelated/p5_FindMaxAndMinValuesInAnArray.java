package allJavaPrograms.arraysRelated;

public class p5_FindMaxAndMinValuesInAnArray {

	public static void main(String[] args) {
		
		int[] a = {50,30,40,20,60};
		int max = a[0];
		
		for(int i=1; i<=a.length-1; i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value in the given array is: > " + max);
		
		
		int min = a[0];
		
		for(int i=1; i<=a.length-1; i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value in the given array is: > " + min);
	}
}
