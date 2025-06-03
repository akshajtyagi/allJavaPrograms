package stringRelated;

public class p3_SwapTheValueOfTwoStrings {

	public static void main(String[] args) {

		/*  // by using third variable
		String a = "Hello", b = "World", t;

		t = a;
		a = b;
		b = t;
		System.out.println("After swap value of a is: >>> " + a);
		System.out.println("After swap value of b is: >>> " + b);
		*/
		
		// without using third variable
		String a = "Hello", b ="World";
		
		a = a+b;
		b = a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		System.out.println("After swap value of a is: >>> " + a);
		System.out.println("After swap value of b is: >>> " + b);

	}
}
