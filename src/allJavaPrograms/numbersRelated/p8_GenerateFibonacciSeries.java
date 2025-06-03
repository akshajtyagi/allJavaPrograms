package allJavaPrograms.numbersRelated;

public class p8_GenerateFibonacciSeries {

	public static void main(String[] args) {

		//	Generate Fibonacci series
		// A series of numbers in which each number is the sum of two preceding numbers.

		int n1=0, n2=1, sum=0, count=0;
		
		for(int i=1; i<=10; i++) {
			
			sum=n1+n2;
			System.out.print(sum + " ");
			n1=n2;
			n2=sum;
			count++;
		}
		System.out.println();
		System.out.println("Total generated fibnocci series number are: >> " + count);

	}
}
