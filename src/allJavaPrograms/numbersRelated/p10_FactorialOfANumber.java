package allJavaPrograms.numbersRelated;

public class p10_FactorialOfANumber {

	public static void main(String[] args) {
		
		// A factorial is a function that multiplies a number by every number below it.
		// e.g: 5!= 5*4*3*2*1 = 120
		// or 5!= 1*2*3*4*5 = 120
		
		int num = 5;
		int fact = 1;
		
		// Ascending order 5!= 1*2*3*4*5 = 120
		for(int i=1; i<=num; i++) {
			fact = fact*i;	// 1*1=1	1*2=2	2*3=6	6*4=24	24*5=120
		}
		
		System.out.println("Factorial of the given number is: >> " + fact);
		
		
//		// Descending order 5!= 5*4*3*2*1 = 120
//		for(int i=num; i>=1; i--) {
//			fact = fact*i;	// 1*1=1	1*2=2	2*3=6	6*4=24	24*5=120
//		}
//		System.out.println("Factorial of the given number is: >> " + fact);
	}
}
