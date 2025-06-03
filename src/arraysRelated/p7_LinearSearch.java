package arraysRelated;

public class p7_LinearSearch {

	public static void main(String[] args) {
		
		int[] a = {10,20,40,50,30};
		int search_ele = 30;
		
		boolean flag=false;
		for(int i=0; i<=a.length-1; i++) {
			if(search_ele==a[i]) {
				System.out.println("Element found at index number: > " + i);
				flag=true;
				break;
			}	
		}
		if(flag==false) {
			System.out.println("Element not Found");
		}
	}
}
